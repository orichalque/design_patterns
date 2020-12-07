package org.iut.nantes.observer.horloge;

interface Sujet
{
  void ajoutObs( Observer o );
  void supprObs( Observer o );
  void notifier();
}
