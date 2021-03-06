package io.weicools.puremusic.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import io.weicools.puremusic.service.AudioPlayer;
import io.weicools.puremusic.service.MusicService;
import io.weicools.puremusic.util.ConstantUtil;

/**
 * Author: weicools
 * Time: 2017/10/30 下午5:14
 *
 * 来电/耳机拔出时暂停播放
 */

public class NoisyAudioStreamReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AudioPlayer.getInstance().playPause();
    }
}
