package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import util.AppUtil;

public class MainController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		count.setItems(countItems);
	}

	// 메인 화면 전환
	@FXML
	private Button changeMainBtn;

	public void changeMain() {
		try {
			Parent main = FXMLLoader.load(getClass().getResource("/view/MainLayout.fxml"));
			Scene scene = new Scene(main);
			Stage primaryStage = (Stage) changeMainBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 1. Recommend

	// 화면 전환
	@FXML
	private Button changeRecommendBtn;

	public void changeRecommend() {
		try {
			Parent recommend = FXMLLoader.load(getClass().getResource("/view/RecommendLayout.fxml"));
			Scene scene = new Scene(recommend);
			Stage primaryStage = (Stage) changeRecommendBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 추천
	@FXML
	private BorderPane resultPane;
	@FXML
	private TextField recommendFood = new TextField();
	Random random = new Random();

	// 가족과 함께
	public void changeFamily() {
		try {
			Parent family = FXMLLoader.load(getClass().getResource("/view/Family.fxml"));
			resultPane.setCenter(family);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultFamily() {
		String[] familyFood = { "볶음밥", "카레라이스", "부대찌개", "된장찌개", "청국장", "김치찌개", "삼겹살", "소고기", "오리고기", "닭갈비", "오므라이스",
				"곱창", "막창", "미역국", "콩나물국", "설렁탕", "육개장", "제육볶음" };
		String resultFood = familyFood[random.nextInt(familyFood.length)];
		recommendFood.setText(resultFood);
	}

	// 친구랑 같이
	public void changeFriend() {
		try {
			Parent friend = FXMLLoader.load(getClass().getResource("/view/Friend.fxml"));
			resultPane.setCenter(friend);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultFriend() {
		String[] friendFood = { "떡볶이", "스파게티", "라멘", "밥버거", "돈까스", "냉면", "덮밥", "오므라이스", "닭발", "쫄면", "카레라이스", "샌드위치",
				"토스트", "우동" };
		String resultFood = friendFood[random.nextInt(friendFood.length)];
		recommendFood.setText(resultFood);
	}

	// 데이트나 소개팅을 할 때
	public void changeLover() {
		try {
			Parent lover = FXMLLoader.load(getClass().getResource("/view/Lover.fxml"));
			resultPane.setCenter(lover);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultLover() {
		String[] loverFood = { "파스타", "스테이크", "피자", "샐러드", "초밥", "커피", "카레라이스", "샌드위치", "수프", "리조또" };
		String resultFood = loverFood[random.nextInt(loverFood.length)];
		recommendFood.setText(resultFood);
	}

	// 제대로 된 식사
	public void changeMeal() {
		try {
			Parent meal = FXMLLoader.load(getClass().getResource("/view/Meal.fxml"));
			resultPane.setCenter(meal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultMeal() {
		String[] mealFood = { "볶음밥", "카레라이스", "부대찌개", "된장찌개", "청국장", "김치찌개", "삼겹살", "소고기", "오리고기", "닭갈비", "오므라이스", "곱창",
				"막창", "잠발라야", "스테이크" };
		String resultFood = mealFood[random.nextInt(mealFood.length)];
		recommendFood.setText(resultFood);
	}

	// 돈이 없을 때 간단한 식사
	public void changeFastfood() {
		try {
			Parent fastfood = FXMLLoader.load(getClass().getResource("/view/Fastfood.fxml"));
			resultPane.setCenter(fastfood);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultFastfood() {
		String[] fastfood = { "햄버거", "감자튀김", "밥버거", "김밥", "라면", "주먹밥", "컵밥", "삼각김밥", "샌드위치", "토스트", "핫도그" };
		String resultFood = fastfood[random.nextInt(fastfood.length)];
		recommendFood.setText(resultFood);
	}

	// 디저트
	public void changeDessert() {
		try {
			Parent dessert = FXMLLoader.load(getClass().getResource("/view/Dessert.fxml"));
			resultPane.setCenter(dessert);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultDessert() {
		String[] dessertFood = { "케이크", "크레이프", "크레페", "빙수", "아이스크림", "탕후루", "와플", "버블티", "빵", "떡", "과일", "마카롱", "당고",
				"화과자", "푸딩", "파이", "팬케이크", "약과", "도넛", "쿠키", "사탕", "커피", "초콜릿", "월병", "도라야키", "크로플", "젤라또" };
		String resultFood = dessertFood[random.nextInt(dessertFood.length)];
		recommendFood.setText(resultFood);
	}

	// 한식
	public void changeKorea() {
		try {
			Parent korea = FXMLLoader.load(getClass().getResource("/view/Korea.fxml"));
			resultPane.setCenter(korea);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultKorea() {
		String[] koreaFood = { "비빔밥", "국밥", "삼겹살", "치킨", "김밥", "부대찌개", "김치찌개", "청국장", "떡볶이", "불고기", "냉면", "볶음밥", "죽",
				"국수", "보쌈", "족발", "제육볶음", "닭발", "삼계탕", "순대", "물회", "아귀찜", "전", "미역국", "콩나물국", "설렁탕", "육개장", "쫄면" };
		String resultFood = koreaFood[random.nextInt(koreaFood.length)];
		recommendFood.setText(resultFood);
	}

	// 중식
	public void changeChina() {
		try {
			Parent china = FXMLLoader.load(getClass().getResource("/view/China.fxml"));
			resultPane.setCenter(china);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultChina() {
		String[] chinaFood = { "마라탕", "짜장면", "짬뽕", "탕수육", "마라샹궈", "마파두부", "깐풍기", "유산슬", "차오멘", "기스멘", "깐쇼새우", "마라룽샤",
				"딤섬", "멘보샤", "훠궈" };
		String resultFood = chinaFood[random.nextInt(chinaFood.length)];
		recommendFood.setText(resultFood);
	}

	// 일식
	public void changeJapan() {
		try {
			Parent japan = FXMLLoader.load(getClass().getResource("/view/Japan.fxml"));
			resultPane.setCenter(japan);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultJapan() {
		String[] japanFood = { "라멘", "규카츠", "타코야끼", "오코노미야끼", "야끼소바", "타이야끼", "초밥", "낫또", "샤브샤브", "오니기리", "우동", "소바",
				"덴푸라", "스키야키", "사시미", "고로케" };
		String resultFood = japanFood[random.nextInt(japanFood.length)];
		recommendFood.setText(resultFood);
	}

	// 양식
	public void changeWestern() {
		try {
			Parent western = FXMLLoader.load(getClass().getResource("/view/Western.fxml"));
			resultPane.setCenter(western);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultWestern() {
		String[] westernFood = { "스파게티", "피자", "햄버거", "스테이크", "수프", "리조또", "잠발라야", "핫도그", "바비큐", "버팔로 윙", "랍스터",
				"피시 앤 칩스", "샌드위치", "오믈렛" };
		String resultFood = westernFood[random.nextInt(westernFood.length)];
		recommendFood.setText(resultFood);
	}

	// 조건 상관없이 랜덤
	public void changeRandom() {
		try {
			Parent random = FXMLLoader.load(getClass().getResource("/view/Random.fxml"));
			resultPane.setCenter(random);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void resultRandom() {
		String[] randomFood = { "볶음밥", "카레라이스", "부대찌개", "된장찌개", "청국장", "김치찌개", "삼겹살", "소고기", "오리고기", "닭갈비", "오므라이스",
				"곱창", "막창", "미역국", "콩나물국", "떡볶이", "스파게티", "라멘", "밥버거", "돈까스", "냉면", "덮밥", "오므라이스", "닭발", "쫄면", "파스타",
				"스테이크", "피자", "샐러드", "초밥", "커피", "샌드위치", "햄버거", "감자튀김", "밥버거", "김밥", "라면", "주먹밥", "컵밥", "삼각김밥", "토스트",
				"케이크", "크레이프", "크레페", "빙수", "아이스크림", "탕후루", "와플", "버블티", "빵", "떡", "과일", "마카롱", "당고", "화과자", "푸딩", "파이",
				"팬케이크", "약과", "도넛", "쿠키", "사탕", "커피", "초콜릿", "월병", "도라야키", "크로플", "젤라또", "비빔밥", "국밥", "치킨", "불고기", "죽",
				"국수", "보쌈", "족발", "제육볶음", "삼계탕", "순대", "물회", "아귀찜", "전", "설렁탕", "육개장", "쫄면", "마라탕", "짜장면", "짬뽕", "탕수육",
				"마라샹궈", "마파두부", "깐풍기", "유산슬", "차오멘", "기스멘", "깐쇼새우", "마라룽샤", "딤섬", "멘보샤", "훠궈", "규카츠", "타코야끼", "오코노미야끼",
				"야끼소바", "타이야끼", "낫또", "샤브샤브", "오니기리", "우동", "소바", "덴푸라", "스키야키", "사시미", "고로케", "수프", "리조또", "잠발라야",
				"핫도그", "바비큐", "버팔로 윙", "랍스터", "피시 앤 칩스", "오믈렛" };
		String resultFood = randomFood[random.nextInt(randomFood.length)];
		recommendFood.setText(resultFood);
	}

	// 2. Choice

	// 화면 전환
	@FXML
	private Button changeChoiceBtn;

	public void changeChoice() {
		try {
			Parent choice = FXMLLoader.load(getClass().getResource("/view/ChoiceLayout.fxml"));
			Scene scene = new Scene(choice);
			Stage primaryStage = (Stage) changeChoiceBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 선택
	@FXML
	private ComboBox<Integer> count = new ComboBox<Integer>();
	@FXML
	private TextField choiceFood = new TextField();
	private ObservableList<Integer> countItems = FXCollections.observableArrayList(1, 2, 3, 4, 5, 6, 7);

	int resultCount;

	public void choiceResult(ActionEvent event) {
		int selectCount = count.getValue();
		selectFood(selectCount);
		
		String resultFood = Integer.toString(resultCount);
		choiceFood.setText(resultFood + "번째 음식이 뽑혔어요. 맛있게 드세요!");
	}

	public int selectFood(int count) {
		int[] intCount = new int[count];
		ArrayList<Integer> arrayCount = new ArrayList<Integer>();

		for (int i = 0; i < intCount.length; i++) {
			arrayCount.add(i, i + 1);
			intCount[i] = arrayCount.get(i);
		}
		
		resultCount = intCount[random.nextInt(intCount.length)];
		return resultCount;
	}

	// 3. List

	// 화면 전환
	@FXML
	private Button changeListBtn;

	public void changeList() {
		try {
			Parent list = FXMLLoader.load(getClass().getResource("/view/ListLayout.fxml"));
			Scene scene = new Scene(list);
			Stage primaryStage = (Stage) changeListBtn.getScene().getWindow();
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private ListView<String> list;
	@FXML
	private TextField userName;
	@FXML
	private TextField foodTaste;

	ObservableList<String> item = FXCollections.observableArrayList();

	// 등록
	public void addList() {
		item.removeAll(item);

		String name = userName.getText();
		if (name.isEmpty()) {
			AppUtil.alert("상대방의 이름이 입력되지 않았습니다.", null);
			return;
		}

		String food = foodTaste.getText();
		if (food.isEmpty()) {
			AppUtil.alert("좋아하는 음식이 입력되지 않았습니다.", null);
			return;
		}

		item.addAll(name + "님이 좋아하시는 음식: " + food);
		list.getItems().addAll(item);
	}

	// 삭제
	public void delList() {
		int index = list.getSelectionModel().getSelectedIndex();
		if (index >= 0) {
			list.getItems().remove(index);
		} else {
			AppUtil.alert("삭제할 내용을 선택해 주세요.", "삭제할 내용이 없습니다.");
		}
	}

}
