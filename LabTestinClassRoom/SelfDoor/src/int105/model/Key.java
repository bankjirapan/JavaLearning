/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int105.model;

/**
 *
 * @author Tisanai.Cha
 */
public abstract class Key {

    
    private int KeyId;
    
    
    
	//Add Code Here

    public Key(int KeyId) {
        this.KeyId = KeyId;
    }

    public int getKeyId() {
        return KeyId;
    }

    public void setKeyId(int KeyId) {
        this.KeyId = KeyId;
    }

    @Override
    public String toString() {
        return "Key{" + "KeyId=" + KeyId + '}';
    }

    
    
}
