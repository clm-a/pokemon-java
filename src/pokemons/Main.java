/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

/**
 *
 * @author clement
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Pokemon monPokemon = new PokemonElectrik(PokemonElectrik.NOMS[1], 20);
        Pokemon adversaire = Pokemon.pokemonAleatoire();
        
        Combat combat1 = new Combat( monPokemon, adversaire );
        
        System.out.println(combat1);
        combat1.doCombat();
        System.out.println("Vainqueur : " + combat1.getVainqueur());
      
    }
    
    
    
}
