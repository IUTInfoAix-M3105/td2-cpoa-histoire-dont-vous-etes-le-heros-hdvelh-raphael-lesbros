/**
 * File: ScenarioDG.java
 * Creation: 7 nov. 2020, Jean-Philippe.Prost@univ-amu.fr
 * Template étudiants
 */
package pracHDVELH;

/**
 * @author prost
 *
 */
public class Scenario {
	private static final String MSG_EMPTY_SCENARIO = "Sorry, no scenario was found.";
	private static final String MSG_FINALE = "That's all folks!";
	private Event head;
	private Event currentEvent;
	private GUIManager gui;

	public Scenario(GUIManager g, Event h) {
		head = h;
		gui = g;
	}

	public String run() {
		if (this.head == null) {
			return this.MSG_EMPTY_SCENARIO;
		}
		while (currentEvent.hasDaughters()) {
			return currentEvent.getData();

		}
		return MSG_FINALE;
	}

	/* TO BE COMPLETED */

	/* MAIN */
	public static void main(String[] args) {
		Scenario scenario;
		GUIManager gui = new GUIManager(System.in, System.out, System.err);

		// S
		// *1:event1
		// **1.1
		// ***S
		// **1.2
		// ***E
		// *2:event2
		// **2.1
		// ***1
		// **2.2
		// ***S

		Event startEvent = new Event(gui,
				"Vous êtes un simple aventurier se reposant pour la nuit dans une taverne, entre deux aventures.\n" + "" +
				"Vous êtes arrivés ici il y a moins d'une heure, avez réservé une chambre, et êtes rapidement allés vous coucher.\n" +
				"Vous vous réveillez en pleine nuit, entendant un bruit à votre fenêtre.\n\n" +
				"(1) Se rendormir\n" +
				"(2) Vérifier la fenêtre\n" +
				"(3) Faire semblant de dormir");

		Event event1 = new Event(gui, "event1:\n" + "(1)1.1 (2)1.2");
		Event event2 = new Event(gui, "event2:\n" + "(1)2.1 (2)2.2");
		Event endEvent = new Event(gui, "End event: that's it :-)");
		startEvent.addDaughter(event1);
		startEvent.setDaughter(event2, 1);
		event1.addDaughter(startEvent);
		event1.addDaughter(endEvent);
		event2.addDaughter(event1);
		event2.addDaughter(startEvent);
		scenario = new Scenario(gui, startEvent);

		// *2
		// ...
		// **2.3:event3
		// ***E
		// ***event3

		/*Event event3 = new EventExactSolution(gui, "Wizard: how much is worth pi?", "3.14159");
		event2.setData(event2.getData() + " (3)2.3");
		event2.addDaughter(event3);
		event3.addDaughter(endEvent);
		event3.addDaughter(event3);*/

		/* ******* */
		// **2.3
		// ***event4
		// ****event2
		// ****E
		// ****event3
		// ...

		/*int[] mask = { 3, 6, 7 };
		Event event4 = new EventRandomSolution(gui, "Random choice of the next event...", mask, "Dice rolling... Roll=",
				"\nNext event is ");
		event3.setDaughter(event4, 0);
		event4.addDaughter(event2);
		event4.addDaughter(endEvent);
		event4.addDaughter(event3);*/

		scenario.currentEvent = scenario.head;
		System.out.println(scenario.run());
	}
}

// eof