/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;
import Indices.*;
/**
 *
 * @author User
 */
public abstract class Animal {
  /** @brief Constructor tanpa parameter dari Hewan
    * Menghidupkan hewan
    */
  public Animal() {
    
  }
  /** @brief Constructor dari Hewan
    * Menghidupkan hewan
    *
    * @param makan integer adalah kode jenis makanan hewan dimana Herbivore=0, Omnivore=1, Carnivore=2
    * @param land boolean menyatakan apakah hewan dapat hidup di darat
    * @param water boolean menyatakan apakah hewan dapat hidup di air
    * @param air boolean menyatakan apakah hewan dapat hidup di udara
    * @param kejinakan boolean menyatakan jinak tidaknya hewan
    * @param x integer adalah letak absis hewan yang dihidupk
    * @param y integer adalah letak ordinat hewan yang dihidupkan
    */
  public Animal(int makan, boolean land, boolean water, boolean air,
	        boolean kejinakan, int x, int y) {
    makanan = makan;
    land_animal = land;
    water_animal = water;
    air_animal = air;
    jinak = kejinakan;
    koordinat = new Indices();
    koordinat.SetAbsis(x);
    koordinat.SetOrdinat(y);
  }
  /** @brief prosedur virtual interact dari hewan
    * I.S hewan telah dihidupkan
    * F.S Mencetak suara hewan kelayar
    * Diimplementasikan pada masing22 class real tiap spesies hewan
    */
  public abstract void Interact();
  /** @brief GetBerat dari hewan
    * Mengembalikan nilai integer berat dari hewan
    * @return int
    */
  public final int GetBerat() {
    return berat_badan;
  }
  /** @brief Prosedur SetBerat  dari hewan
    * I.S bb adalah berat badan yang valid yaitu lebih dari 0
    * F.S atribut berat badan hewan diubah menjadi bb
    * Merubah nilai berat dari hewan
    *
    * @param bb integer menyatakan input berat badan yang ingin di set
    */
  public final void SetBerat(int bb) {
    berat_badan = bb;
  }
  /** @brief GetKoordinat dari hewan
    * Mengembalikan nilai Indices ordinat hewan
    */
  public Indices GetKoordinat() {
    return koordinat;
  }
  /** @brief Prosedur SetKoordinat  dari hewan
    * I.S x dan y adalah koordinat yang valid pada zoo
    * F.S atribut koordinat hewan memiliki absis x dan ordinat y
    * Merubah nilai Koordinat dari hewan
    *
    * @param x integer menyatakan absis yang ingin di set
    * @param y integer menyatakan ordinat yang ingin di set
    */
  /*
  public void SetKoordinat(int x, int y) {
    koordinat.SetAbsis(x);
    koordinat.SetOrdinat(y);
  }
  */
  /** @brief Mengembalikan nilai booleanean apakah hewan dapat hidup di Land
    * @return boolean
    */
  public final boolean IsLandAnimal() {
    return land_animal;
  }
  /** @brief Mengembalikan nilai booleanean apakah hewan dapat hidup di Water
    * @return boolean
    */
  public final boolean IsWaterAnimal() {
    return water_animal;
  }
  /** @brief Mengembalikan nilai booleanean apakah hewan dapat hidup di Air
    * @return boolean 
    */ 
  public final boolean IsAirAnimal() {
    return air_animal;
  }
  /** @brief Mengembalikan nilai booleanean apakah hewan jinak
    * @return boolean 
    */
  public final boolean IsJinak() {
    return jinak;
  }
  /** @brief Mengembalikan nilai booleanean apakah hewan dapat tinggal pada Cell C
    * 
    * @param C Cell yang dicek untuk hewan dapat tinggal atau tidak
    * @return boolean
    */
  /*
  public boolean IsLivable(Cell c) {
    if (c.IsHabitat()) {
      return ((c.IsLand() && IsLandAnimal()) ||
              (c.IsWater() && IsWaterAnimal()) ||
              (c.IsAir() && IsAirAnimal()));
    } else {
      return false;
    }
  }
  */
  /** @brief Mengembalikan nilai integer keterangan makanan hewan
    * @return int
    */
  public final int GetMakanan() {
    return makanan;
  }
  /** @brief Atribut berat_badan  menyatakan berapa berat hewan tersebut
    */
  protected int berat_badan;
  /** @brief Atribut koordinat  adalah letak dimana hewan berada
    */
  protected Indices koordinat;
  /** @brief Atribut makanan adalah keterangan klasifikasi hewan berdasarkan makanan dimana Herbivore=0, Omnivore=1, Carnivore=2
    */
  protected int makanan;
  /** @brief Atribut land_animal  adalah booleanean yang menyatakan dapatkah hewan tinggal di darat
    */
  protected boolean land_animal;
  /** @brief Atribut water_animal  adalah booleanean yang menyatakan dapatkah hewan tinggal di air
    */
  protected boolean water_animal;
  /** @brief Atribut air_animal  adalah booleanean yang menyatakan dapatkah hewan tinggal di udara
    */
  protected boolean air_animal;
  /** @brief Atribut jinak  adalah booleanean yang menyatakan jinak atau tidaknya hewan
    */
  protected boolean jinak;
}
