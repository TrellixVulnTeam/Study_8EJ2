package com.asuper.musicpractice.model;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by super on 2017-10-13.
 */

public class Music {
    private static Music music = null;
    public List<Item> data = new ArrayList<>();

    private Music(){}

    public static Music getInstance() {
        if(music == null)
            music = new Music();
        return music;
    }

    public void load(Context context) {
        ContentResolver resolver = context.getContentResolver();
        Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        String proj[] = {
                MediaStore.Audio.Media._ID,
                MediaStore.Audio.Media.ALBUM_ID,
                MediaStore.Audio.Media.TITLE,
                MediaStore.Audio.Media.ARTIST
        };
        Cursor cursor = resolver.query(uri, proj, null, null, proj[2]+" ASC");
        if(cursor != null) {
            while(cursor.moveToNext()) {
                Item item = new Item();
                item.id = getValue(cursor, proj[0]);
                item.albumId = getValue(cursor, proj[1]);
                item.artist = getValue(cursor, proj[2]);
                item.title = getValue(cursor, proj[3]);

                item.musicUri = makeMusicUri(item.id);
                item.albumUri = makeAlbumUri(item.albumId);
                data.add(item);
            }
            cursor.close();
        }
    }

    private String getValue(Cursor cursor, String name){
        int index = cursor.getColumnIndex(name);
        return cursor.getString(index);
    }

    private Uri makeMusicUri(String musicId){
        Uri contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        return Uri.withAppendedPath(contentUri, musicId);
    }

    private Uri makeAlbumUri(String albumId){
        String contentUri = "content://media/external/audio/albumart/";
        return Uri.parse(contentUri + albumId);
    }

    public class Item {
        public String id;
        public String albumId;
        public String artist;
        public String title;

        public Uri musicUri;
        public Uri albumUri;
    }
}
