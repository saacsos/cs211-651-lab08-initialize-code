package ku.cs.shop.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import ku.cs.shop.models.MemberCard;
import com.github.saacsos.FXRouter;

import java.io.IOException;

public class HomeController {
    private MemberCard john, anna, harry;


    @FXML
    public void initialize() {
        john = new MemberCard("John Smith", "081-222-8888");
        anna = new MemberCard("Anna Frost", "082-333-9999", 135);
        harry = new MemberCard("Harry Potter", "083-444-0000", 40000);
    }
    @FXML
    public void handleJohnMemberCardButton(ActionEvent actionEvent) {
        try {
            // เปลี่ยนการแสดงผลไปที่ route ที่ชื่อ member_card_detail
            // พร้อมส่ง reference instance john ไปด้วย
            FXRouter.goTo("member_card_detail", john);
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_detail ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }
    @FXML
    public void handleAnnaMemberCardButton(ActionEvent actionEvent) {
        try {
            // เปลี่ยนการแสดงผลไปที่ route ที่ชื่อ member_card_detail
            // พร้อมส่ง reference instance john ไปด้วย
            FXRouter.goTo("member_card_detail", anna);
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_detail ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }
    @FXML
    public void handleHarryMemberCardButton(ActionEvent actionEvent) {
        try {
            // เปลี่ยนการแสดงผลไปที่ route ที่ชื่อ member_card_detail
            // พร้อมส่ง reference instance john ไปด้วย
            FXRouter.goTo("member_card_detail", harry);
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_detail ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }
    @FXML public void handleAboutButton(ActionEvent actionEvent){
        try {
            // เปลี่ยนการแสดงผลไปที่ route ที่ชื่อ member_card_detail
            // พร้อมส่ง reference instance john ไปด้วย
            FXRouter.goTo("about");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า about ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }

    @FXML public void handleMemberCardListButton(ActionEvent actionEvent){
        try {
            // เปลี่ยนการแสดงผลไปที่ route ที่ชื่อ member_card_detail
            // พร้อมส่ง reference instance john ไปด้วย
            FXRouter.goTo("member_card_list");
        } catch (IOException e) {
            System.err.println("ไปที่หน้า member_card_list ไม่ได้");
            System.err.println("ให้ตรวจสอบการกำหนด route");
        }
    }


}
