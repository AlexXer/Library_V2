package factory;

import beans.enm.TypeOfBook;

public class BookFactory {
    /**
     * Get factory factory.
     *
     * @param typeOfBook the type of book
     * @return the factory
     */
    public Factory getFactory (TypeOfBook typeOfBook){
        switch (typeOfBook){
            case CLASSIC:
                return new ClassicBookFactory();
            case FICTION:
                return  new FictionBookFactory();
            case SCIENCE:
                return new ScienceBookFactory();
            default:
                return null;
        }
    }
}
