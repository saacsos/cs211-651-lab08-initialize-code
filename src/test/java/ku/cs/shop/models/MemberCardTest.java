package ku.cs.shop.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberCardTest {
    MemberCard card;

    @BeforeEach
    void setup(){
        card = new MemberCard("John Smith", "080-123-4567");
        card.addPurchase(49);
        card.addPurchase(51);
    }

    @Test
    @DisplayName("เพิ่มยอดซื้อ 49 และ 51 บาท ได้ยอดสะสม 100 บาท")
    void testAddPurchase() {
        card.addPurchase(500);
        assertEquals(600, card.getCumulativePurchase());
    }

    @Test
    @DisplayName("เพิ่มยอดซื้อ 49 และ 51 บาท ได้สแตมป์ 1 ดวงจากยอดซื้อ 51 บาทเท่านั้น")
    void testPointAfterAddPurchase() {
        assertEquals(1, card.getStamp());

        MemberCard card2 = new MemberCard("John Smith", "080-123-4567");
        card2.addPurchase(49);
        card2.addPurchase(51);
//        MemberCard card2 = card;
        assertEquals(card2,card);
    }

    @Test
    void testUseStamp(){
        card.addPurchase(150);
        card.useStamp(2);
        assertEquals(2,card.getStamp());
        card.useStamp(200);
        assertEquals(2,card.getStamp());
        card.useStamp(-1);
        assertEquals(2,card.getStamp());
    }

}