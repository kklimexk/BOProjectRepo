package pl.bo.scheduler.pszczolki;

public class Zadanie {
	
	int _koszt;
	int _czas;
	double _atrakcyjnosc;
	
	Zadanie(int koszt, int czas){
		_koszt = koszt;
		_czas = czas;
		_atrakcyjnosc = 1.0 * koszt / czas;
	}
	
}
