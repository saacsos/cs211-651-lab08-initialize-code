package ku.cs.shop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MemberCardListTest {

    MemberCardList cards;
    MemberCard card1;
    MemberCard card2;
    @BeforeEach
    void setup(){
        cards = new MemberCardList();
        card1 = new MemberCard("John Smith", "080-123-4567");
        card2 = new MemberCard("Jith Smohn", "098-765-4321");
        cards.addCard(card1);
        cards.addCard(card2);
    }

    @Test
    void testAddCard(){
        assertEquals(card1,cards.getAllCards().get(0));
        assertEquals(card2,cards.getAllCards().get(1));
        assertEquals(2,cards.getAllCards().size());
        MemberCard card3 = new MemberCard("For Check","000-000-0000");
        cards.addCard(card3);
        assertEquals(3,cards.getAllCards().size());

    }

    @Test
    void testGetAllCards(){
        MemberCardList check = new MemberCardList();
        check.addCard(card1);
        check.addCard(card2);
        MemberCard newCard = new MemberCard("For Check","000-000-0000");
        check.addCard(newCard);
        cards.addCard(newCard);
        for(int i = 0 ; i < cards.getAllCards().size() ; i++){
            assertEquals(check.getAllCards().get(i),cards.getAllCards().get(i));
        }
    }

}