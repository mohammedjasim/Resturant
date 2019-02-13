package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
 
public class MainController implements Initializable {

	//add FXML connector
	
	@FXML
	private Label ownLabel;
	@FXML
	private TextField TableNO;
	@FXML
	private TextField NumberofPerson;
	
	@FXML
	private ComboBox<String> mycombo;
	
	@FXML
	private ListView<String> myListview;
	/*@FXML
	private ComboBox<String> myPerson;*/
	
	ObservableList<String> list = 
		 FXCollections.observableArrayList("kecheen","Beef","Vigtable");
	 
	ObservableList<String> list1 = 
			 FXCollections.observableArrayList("Betza","Bargur","Sube","Sandwich");
	
	float Price[];
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mycombo.setItems(list);
		//myListview.setItems(list2);
	//	myListview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}
	public void printShow(ActionEvent event) {
		mycombo.getItems().addAll();
		
	}
	/*public void printShow1(ActionEvent event) {
		myPerson.getItems();}*/
	public void printResult(ActionEvent event) {
		float ps=Price[myListview.getSelectionModel().getSelectedIndex()];
		float pr=Price[myListview.getSelectionModel().getSelectedIndex()]*Integer.parseInt(NumberofPerson.getText());
		String s=mycombo.getSelectionModel().getSelectedItem()+" "+myListview.getSelectionModel().getSelectedItem()+ "   "+NumberofPerson.getText()+"   "+ "Table No:"+TableNO.getText();
		Alert a=new Alert(AlertType.INFORMATION,"Order Informatios : \n"+s+"\nTotal price = "+pr+"\nSingle price = "+ps,ButtonType.OK);
		a.show();
		
	}
	
	public void printListView(ActionEvent event) {
		myListview.getItems().clear();
		if(mycombo.getSelectionModel().getSelectedIndex()==2) {
			myListview.getItems().addAll("Betza","Sube");
			Price=new float[myListview.getItems().size()];
			Price[0]=7;
			Price[1]=3;
		}else if (mycombo.getSelectionModel().getSelectedIndex()==1){
		myListview.getItems().addAll("Betza","Bargur","Sube","Sandwich");
		Price=new float[myListview.getItems().size()];
		Price[0]=12;
		Price[1]=6;
		Price[2]=5;
		Price[3]=6;
		}
		else if (mycombo.getSelectionModel().getSelectedIndex()==0){
			myListview.getItems().addAll("Betza","Bargur","Sube","Sandwich");
			Price=new float[myListview.getItems().size()];
			Price[0]=10;
			Price[1]=5;
			Price[2]=4;
			Price[3]=6;
			
			}
//		ObservableList<String> myList;
//		myList  = myListview.getSelectionModel().getSelectedItems();
//		for(String lit : myList) {
//			System.out.println(lit);
//		}
		
	}
	
	
	
	 
}

 