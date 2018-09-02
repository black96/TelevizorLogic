package edu.tv;

import edu.interfejs.TV;
import edu.stanja.Stanja;

public class Televizor implements TV {
	private int kanal=1;
    private int zvuk=0;
    private int omiljeni[]={2,11,7,1,4};
    /**
	 * @return the omiljeni
	 */
	public int[] getOmiljeni() {
		return omiljeni;
	}
	/**
	 * @param omiljeni the omiljeni to set
	 */
	public void setOmiljeni(int[] omiljeni) {
		this.omiljeni = omiljeni;
	}
	Stanja s;
    
    
	/**
	 * @return the kanal
	 */
	public int getKanal() {
		return kanal;
	}
	/**
	 * @param kanal the kanal to set
	 */
	public void setKanal(int kanal) {
		this.kanal = kanal;
	}
	/**
	 * @return the zvuk
	 */
	public int getZvuk() {
		return zvuk;
	}
	/**
	 * @param zvuk the zvuk to set
	 */
	public void setZvuk(int zvuk) {
		this.zvuk = zvuk;
	}
	/**
	 * @return the s
	 */
	public Stanja getS() {
		return s;
	}
	/**
	 * @param s the s to set
	 */
	public void setS(Stanja s) {
		this.s = s;
	}
	@Override
	public int promenaKanala() {

		if(kanal<16){
			kanal=kanal+1;
		}
		return kanal;
		
	}
	@Override
	public int promenaZvuka() {
		if(zvuk<20){
			zvuk=zvuk+1;
		}
		return zvuk;
		
	}
	@Override
	public int smanjivanjeKanala() {
		if(kanal>1){
			kanal=kanal-1;
			}
			return kanal;
		
		
	}
	@Override
	public int smanjivanjeZvuka() {
		if(zvuk>0){
			zvuk=zvuk-1;
		}
		return zvuk;
	}
	@Override
	public void ukljucen() {
		if(s==s.sON){
			kanal=1;
			zvuk=10;
		}
		
	}
	@Override
	public void iskljucen() {
		if(s==s.sOFF){
			kanal=0;
			zvuk=0;
		}
		
	}
	
	public Televizor(int kanal, int zvuk, int[] omiljeni, Stanja s) {
		super();
		this.kanal = kanal;
		this.zvuk = zvuk;
		this.omiljeni = omiljeni;
		this.s = s;
	}
	public Televizor() {
		super();
		
	}
	
}
