package uiza.activity.home.v2.canslide;

/**
 * Created by www.muathu@gmail.com on 12/24/2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uiza.R;
import vn.loitp.core.base.BaseFragment;
import vn.loitp.restapi.uiza.model.v2.getdetailentity.GetDetailEntity;
import vn.loitp.uizavideo.view.rl.videoinfo.UizaIMAVideoInfo;

public class FrmBottom extends BaseFragment {
    private final String TAG = getClass().getSimpleName();
    private UizaIMAVideoInfo uizaIMAVideoInfo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frm_bottom, container, false);
        uizaIMAVideoInfo = (UizaIMAVideoInfo) view.findViewById(R.id.uiza_video_info);
        return view;
    }

    public void setup(GetDetailEntity getDetailEntity){
        uizaIMAVideoInfo.setup(getDetailEntity);
    }
}