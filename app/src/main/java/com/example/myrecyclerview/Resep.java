package com.example.myrecyclerview;

import android.os.Parcel;
import android.os.Parcelable;

public class Resep implements Parcelable {
    private String name, remarks, photo,detail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() { return detail; }

    public void setDetail(String detail) { this.detail = detail; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remarks);
        dest.writeString(this.photo);
        dest.writeString(this.detail);
    }
    public Resep(){}
    protected Resep(Parcel in){
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = in.readString();
        this.detail = in.readString();
    }

    public static final Parcelable.Creator<Resep> CREATOR = new Parcelable.Creator<Resep>(){
        @Override
        public Resep createFromParcel(Parcel source){
            return new Resep(source);
        }
        @Override
        public Resep[] newArray(int size){
            return new Resep[size];
        }
    };
}
