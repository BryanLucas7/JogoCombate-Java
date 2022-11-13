package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public int getAttack() {
		return attack;
	}
	public int getArmor() {
		return armor;
	}
    public void takeDamage( int attack1) {
    	if(this.armor>attack1) {
	    		life-=1;
	    		if(this.life<0) {
	        		this.life=0;
        	}
    	}
    	else {
    		life-=attack1;
        	life+=armor;
    		if(this.life<0) {
        		this.life=0;
        	}
    	}
    	
    	
    	
    }
    public String status() {
    	
    	if(this.life<=0) {
    		return name
    	    		 +": "
    	    		 +this.life
    	    		 +" de vida (morreu)";
    	}
    	else {
    		return name
    	    		 +": "
    	    		 +this.life
    	    		 +" de vida";
    	}
    	
    }


}
