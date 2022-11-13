package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Champion;
public class Program {

	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
	  Scanner sc= new Scanner(System.in);
	  Champion c1,c2;
	  System.out.print("Digite os Dados do primeiro Campeao: \n");
	  System.out.print("Nome: ");
	  String name=sc.nextLine();
	  System.out.print("Vida inicial: ");
	  int life=sc.nextInt();
	  System.out.print("Ataque: ");
	  int attack=sc.nextInt();
	  System.out.print("Armadura: ");
	  int armor=sc.nextInt();
	  sc.nextLine();
	  c1= new Champion(name,life,attack,armor);
	  System.out.print("\n");
	  System.out.print("\n");
	  System.out.print("Digite os Dados do segundo Campeao: \n");
	  System.out.print("Nome: ");
	  name=sc.nextLine();
	  System.out.print("Vida inicial: ");
	  life=sc.nextInt();
	  System.out.print("Ataque: ");
	  attack=sc.nextInt();
	  System.out.print("Armadura: ");
	  armor=sc.nextInt();
	  c2= new Champion(name,life,attack,armor);
	  System.out.print("\n");
	  System.out.print("\n");
	  System.out.print("Digite quantos turnos você quer executar: ");
	  int n = sc.nextInt();
	  System.out.print("\n");
	  int j=c2.getAttack();
	  int y=c1.getAttack();
	  for(int i=0;i<n;i++) {
		  System.out.printf("Resultado do turno %d \n", i+1);
		  System.out.printf("c1life: %d c1attack: %d c1armor: %d \n",c1.getLife(),c1.getAttack(),c1.getArmor() );
		  System.out.printf("c2life: %d c2attack: %d c2armor: %d \n",c2.getLife(),c2.getAttack(),c2.getArmor() );
		
		  c1.takeDamage(c2.getAttack());
		  c2.takeDamage(c1.getAttack());
		  System.out.printf("c1life: %d c1attack: %d c1armor: %d \n",c1.getLife(),c1.getAttack(),c1.getArmor() );
		  System.out.printf("c2life: %d c2attack: %d c2armor: %d \n",c2.getLife(),c2.getAttack(),c2.getArmor() );
		  System.out.print("\n");
		  System.out.println(c1.status());
		  System.out.println(c2.status());
		  if(c1.getLife()== 0 || c2.getLife()==0 ){
			  break;
		  }
		 
		  
	  }
	  System.out.print("\n");
	  System.out.print("FIM DO COMBATE");
	  
	  
	  sc.close();

	}
  
}
