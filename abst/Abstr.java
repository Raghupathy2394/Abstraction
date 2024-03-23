package abst;

abstract class World
{
	abstract void Cricket();

    void cup() {
	System.out.println("India left the world cup");
}}
class Final extends World{
void Cricket() {
		System.out.println("India win");
	}
	
}
public class Abstr {

	public static void main(String[] args) {
	World obj=new Final();
		obj.Cricket();
		obj.cup();
	}}


