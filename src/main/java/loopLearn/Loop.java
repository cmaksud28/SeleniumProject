package loopLearn;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop Practice
		for(int i=0;i<5;i++){
			System.out.println("I am learning Selenium using Java language");
		}
		System.out.println("___________________Below Java Arrow start____________________");
		//Employee object
		String[] Emp= {"Talha","Musa","Ismail","Manha","Ayan","Mayra","Ieman","Arham","Madiha","Ishaq","Nusuk","ISTIAK"};
				for(int j=0;j<12;j++) {
					System.out.println(Emp[j]);
					System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
					/*String[] Emp1=new String[4];
					Emp1[0]="Rafi";
					Emp1[1]="Talha";
					Emp1[2]="Travis";
					Emp1[3]="Jony";
					for(int k=0;k<4;k++) {
						System.out.println(Emp1[k]);
					
					}*/
					int i=2;
					
					while(i<=40){
						
						System.out.println(i);
						i=i+2;
					}
					
					System.out.println("___________");
					
					int j1=3;
					
					do {
						System.out.println(j1);
						j1=j1+2;
					}while(j1<=35);
					System.out.println("__________");
					//for each lopp
					String[] QaLearn = {"Harun","Reza", "Daizy", "Touhid","Shipan","Sumaiya","xyz","abc","Mamun","ijk"};
					
					for(String eachQaLearn : QaLearn) {
						
						System.out.println(eachQaLearn);
						
					}
					
					
					System.out.println("___________");
					
		}

	}
}


