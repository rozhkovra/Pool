package ru.smallmazila.framework.impl;

import java.io.IOException;

import ru.smallmazila.framework.Audio;
import ru.smallmazila.framework.Music;
import ru.smallmazila.framework.Sound;
import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;

public class AndroidAudio implements Audio {
	AssetManager assets;
	SoundPool soundPool;
	
	public AndroidAudio(Activity activity){
		activity.setVolumeControlStream(AudioManager.STREAM_MUSIC);
		this.assets = activity.getAssets();
		this.soundPool = new SoundPool(20, AudioManager.STREAM_MUSIC, 0);
	}
	
	@Override
	public Music newMusic(String fileName) {
		// TODO Auto-generated method stub
		try{
			AssetFileDescriptor assetDescriptor = assets.openFd(fileName);
			return new AndroidMusic(assetDescriptor);
		}catch(IOException e){
			throw new RuntimeException("Can't load music '"+ fileName+"'");
		}
	}

	@Override
	public Sound newSound(String fileName) {
		// TODO Auto-generated method stub
		try{
			AssetFileDescriptor assetDescriptor = assets.openFd(fileName);
			int soundId = soundPool.load(assetDescriptor, 0);
			return new AndroidSound(soundPool, soundId);
		}catch(IOException e){
			throw new RuntimeException("Can't load sound '"+fileName+"'");
		}
	}

}
