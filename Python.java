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

public class Python extends Squamata {
  /** @brief Constructor dari Python
    * Menghidupkan hewan Python
    *
    * @param x integer adalah letak absis Python yang dihidupkan
    * @param y integer adalah letak ordinat Python yang dihidupkan
    * @param bb integer adalah berat badan Python yang dihidupkan
    */
  public Python(int bb, int x, int y) {
    super(false, x, y);
    SetBerat(bb);
  }
  
  @Override
  /** @brief prosedur Interact dari objek Python
    * I.S hewan telah dihidupkan
    * F.S interaksi hewan tercetak ke layar
    * Mencetak interaksi Python ke layar
    */
  public void Interact() {
    System.out.println("Ssshhh");
  }
}
