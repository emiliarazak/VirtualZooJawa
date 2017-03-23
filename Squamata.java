/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author User
 */
public abstract class Squamata extends Animal {
  /** @brief Constructor dari Squamata
    * Menghidupkan hewan Ordo Squamata
    *
    * @param x integer adalah letak absis Squamata yang dihidupkan
    * @param y integer adalah letak ordinat Squamata yang dihidupkan
    * @param kejinakan boolean menyatakan jinak tidaknya hewan
    */    
  public Squamata(boolean kejinakan, int x, int y) {
    super(2, true, false, false, kejinakan, x, y);
  }
}
