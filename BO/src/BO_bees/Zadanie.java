package BO_bees;

public class Zadanie {
	
	int _koszt;
	int _czas;
	double _atrakcyjnosc;
	
	Zadanie(int koszt, int czas){
		_koszt = koszt;
		_czas = czas;
		_atrakcyjnosc = koszt/czas;
	}
	
}
