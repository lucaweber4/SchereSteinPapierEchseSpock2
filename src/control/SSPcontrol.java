package control;

import view.GuiSpiel2;
import view.GuiStart2;

public class SSPcontrol 
{
	public static int randomnumber;
	public static int pointsplayer;
	public static int pointspc;

	public static void createRandomNumber()
	{
		randomnumber = (int) (Math.random()*5);
		checkWin();
	}

	public static void checkWin()
	{
		if(pointsplayer < GuiStart2.runden && pointspc < GuiStart2.runden)
		{
			if(randomnumber == GuiSpiel2.playernumber)
			{
				GuiSpiel2.tfWahl.setText("****");
				GuiSpiel2.tfNotiz.setText("Niemand bekommt einen Punkt");
			}

			if(randomnumber==1)
			{
				GuiSpiel2.tfWahl.setText("Schere");

				if(GuiSpiel2.playernumber==2 || GuiSpiel2.playernumber==5)
				{
					pointsplayer++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde gewonnen!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
				else if(GuiSpiel2.playernumber==3 || GuiSpiel2.playernumber==4)
				{
					pointspc++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde verloren!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
			}

			if(randomnumber==2)
			{
				GuiSpiel2.tfWahl.setText("Stein");

				if(GuiSpiel2.playernumber==1 || GuiSpiel2.playernumber==4)
				{
					pointspc++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde verloren!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
				if(GuiSpiel2.playernumber==3 || GuiSpiel2.playernumber==5)
				{
					pointsplayer++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde gewonnen!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}		
			}

			if(randomnumber==3)
			{
				GuiSpiel2.tfWahl.setText("Papier");

				if(GuiSpiel2.playernumber==1 || GuiSpiel2.playernumber==4)
				{
					pointsplayer++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde gewonnen!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
				if(GuiSpiel2.playernumber==2 || GuiSpiel2.playernumber==5)
				{
					pointspc++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde verloren!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
			}

			if(randomnumber==4)
			{
				GuiSpiel2.tfWahl.setText("Echse");

				if(GuiSpiel2.playernumber==1 || GuiSpiel2.playernumber==2)
				{
					pointsplayer++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde gewonnen!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
				if(GuiSpiel2.playernumber==3 || GuiSpiel2.playernumber==5)
				{
					pointspc++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde verloren!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
			}

			if(randomnumber==5)
			{
				GuiSpiel2.tfWahl.setText("Spock");

				if(GuiSpiel2.playernumber==1 || GuiSpiel2.playernumber==2)
				{
					pointspc++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde verloren!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
				if(GuiSpiel2.playernumber==3 || GuiSpiel2.playernumber==4)
				{
					pointsplayer++;
					GuiSpiel2.tfNotiz.setText(GuiStart2.textField.getText() + ", du hast diese Runde gewonnen!");
					GuiSpiel2.tfSs1.setText(""+pointsplayer);
					GuiSpiel2.tfSs2.setText(""+pointspc);
				}
			}
		}
		else 
		{
			GuiSpiel2.tfWahl.setText("*****");
			GuiSpiel2.tfNotiz.setText("Wir haben einen Gewinner");
			System.exit(0);
		}
	}
}

