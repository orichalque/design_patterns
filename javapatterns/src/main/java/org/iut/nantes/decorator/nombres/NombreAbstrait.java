package org.iut.nantes.decorator.nombres;

abstract class NombreAbstrait
{
  public abstract void base();
  public abstract int getEntier();	// pas genial, mais c'est ça où
					// mettre un champ entier dans
					// le Decorator (encore pire)
}
