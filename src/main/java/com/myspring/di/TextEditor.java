package com.myspring.di;

/**
 * Created by Hessam on 5/8/17.
 */
public class TextEditor {
    private SpellChecker spellChecker;
    public void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker.");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
