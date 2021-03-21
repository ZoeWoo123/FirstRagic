package com.sded.zoetest.domain;

public class Candidate {
    private String Address;
    private String Zipcode;
    private int _ragicId;
    private boolean _star;
    private String ID;
    private String _index_title_;
    private String _index_;
    private int _seq;

    public Candidate(){

    }
    public Candidate(String addr, String zc){
        this.Address = addr;
        this.Zipcode = zc;
    }

    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        this.Address = address;
    }
    public String getZipcode() {
        return Zipcode;
    }
    public void setZipcode(String zipcode) {
        this.Zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Candidate [seqNbr=" + ID + ", Address=" + Address + ", Zipcode=" + Zipcode + "]";
    }

    public int get_ragicId() {
        return _ragicId;
    }
    public void set_ragicId(int _ragicId) {
        this._ragicId = _ragicId;
    }
    public boolean is_star() {
        return _star;
    }
    public void set_star(boolean _star) {
        this._star = _star;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String get_index_title_() {
        return _index_title_;
    }
    public void set_index_title_(String _index_title_) {
        this._index_title_ = _index_title_;
    }
    public String get_index_() {
        return _index_;
    }
    public void set_index_(String _index_) {
        this._index_ = _index_;
    }
    public int get_seq() {
        return _seq;
    }
    public void set_seq(int _seq) {
        this._seq = _seq;
    }
    
}
