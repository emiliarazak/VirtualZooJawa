/**
 * 
 */
package indices;

/**
 * @author suzaneringoringo
 *
 */
public final class Indices {
	/** @brief Constructor tanpa parameter dari indices
	  * Menghidupkan indeks
	  */
	public Indices() {
	  x = 0;
	  y = 0;
	}
	/** @brief Constructor dengan parameter dari indices
	  * Menghidupkan indeks sesuai parameter
	  *
	  * @param x integer adalah absis yang akan di set
	  * @param y integer adalah ordinat yang akan di set
	  */
	public Indices(int absis, int ordinat) {
	  this.x = absis;
	  this.y = ordinat;
	}
	/** @brief Operator overloading = dari indices
	  * Memastikan bukan bitewise copy
	  *
	  * @param I menyatakan indices yang ingin disalin
	  */
	public void CopyIndices (Indices ind) {
	  x = ind.GetAbsis();
	  y = ind.GetOrdinat();
	}
	/** @brief GetAbsis dari indices
	  * Mengembalikan nilai absis dari indeks
	  *
	  */
	public int GetAbsis() {
	  return x;
	}
	/** @brief GetOrdinat dari indices
	  * Mengembalikan nilai ordinat dari indeks
	  *
	  */
	public int GetOrdinat() {
	  return y;
	}
	/** @brief Prosedur SetAbsis dari indices
	  * I.S indices sudah hidup dan masukan terdefinisi
	  * F.S Absis indices nilai menjadi masukan
	  *
	  * @param x integer adalah nilai absis yang akan di set
	  */
	public void SetAbsis(int x) {
	  this.x = x;
	}
	/** @brief Prosedur SetOrdinat dari indices
	  * I.S indices sudah hidup dan masukan terdefinisi
	  * F.S Ordinat indices nilai menjadi masukan
	  *
	  * @param y integer adalah nilai ordinat yang akan di set
	  */
	public void SetOrdinat(int y) {
	  this.y = y;
	}
	/** @brief Mengembalikan nilai booleanean apakah indices masukan sama dengan current objek
	  *
	  * @param I indices yang ingin dibandingkan dengan current objek
	  */
	public boolean IsEqual(Indices ind) {
	  return ((this.x == ind.GetAbsis()) && (this.y == ind.GetOrdinat()));
	}
	public void PrintKoordinat() {
	  System.out.println("(" + x + ", " + y + ")");
	}
	/** @brief Attribut x adalah nilai absis indeks
	  */
	protected int x;
	/** @brief Attribut y adalah nilai ordinat indeks
	  */
	protected int y;
}