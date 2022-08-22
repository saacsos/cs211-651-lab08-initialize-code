package ku.cs.shop.services;

import ku.cs.shop.models.MemberCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberCardListHardCodeDataSourceTest {

    MemberCardListHardCodeDataSource dataSource;
    @BeforeEach
    void setup(){
        dataSource = new MemberCardListHardCodeDataSource();
    }

    @Test
    void testReadData(){
        MemberCard anna = new MemberCard("Anna Frost", "082-333-9999", 135);
        MemberCard harry = new MemberCard("Harry Potter", "083-444-0000", 40000);
        MemberCard check = dataSource.getCardList().getAllCards().get(1);
        assertEquals(anna,check);
        check = dataSource.getCardList().getAllCards().get(2);
        assertEquals(harry,check);
    }

    @Test
    void testGetCardList(){
        int check = dataSource.getCardList().getAllCards().size();
        assertEquals(4,check);
    }

}