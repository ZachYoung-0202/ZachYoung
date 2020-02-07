package DailyWork.framework;
public class FrameWork {
	public static void main(String[] args) {
		Cook chefexpert = new ChefExpert();
		Cook chefmaster = new ChefMaster();
		chefexpert.cook();
		chefmaster.cook();
	}
}
