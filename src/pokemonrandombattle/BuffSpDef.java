package pokemonrandombattle;

public class BuffSpDef extends Movimento {

	public BuffSpDef(String[] dadosMovimento) {
		super(dadosMovimento);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * execute um Buff no SpDef do pokemon atacante
	 * @param1 movimento
	 * @param2 pokemon atacante
	 * @param3 pokemon defendendo
	 * @return 0
	 */
	@Override
	public int executeMove(Movimento move, Pokemon atkr, Pokemon defr) {
		atkr.setSpDef(atkr.getSpDef()*move.getDanoBase());
		return 0;
	}

}
