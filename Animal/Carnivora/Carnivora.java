package Animal.Carnivora;

import Animal.Animal;

/** Kelas Ordo Carnivora
 * 
 * @author Suzane Ringoringo
 */

public abstract class Carnivora extends Animal {
  /** Constructor dari Carnivora
    * Menghidupkan hewan Ordo Carnivora
    *
    * @param x integer adalah letak absis Carnivora yang dihidupkan
    * @param y integer adalah letak ordinat Carnivora yang dihidupkan
    * @param kejinakan boolean menyatakan jinak tidaknya hewan
    * 
    * @author Suzane Ringoringo
    */    
  public Carnivora(boolean kejinakan, int x, int y) {
    super(2, true, false, false,kejinakan,x,y);
  }
}
