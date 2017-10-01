package worldline.ssm.rd.ux.wltwitter.ui.fragments;

import interfaces.TweetChangeListener;
import worldline.ssm.rd.ux.wltwitter.R;
import worldline.ssm.rd.ux.wltwitter.pojo.Tweet;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class TweetsFragment extends Fragment implements TweetChangeListener {

	public TweetsFragment() {}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_wltwitter, container, false);
		return rootView;
	}

	@Override
	public void onTweetRetrieved(List<Tweet> tweets) {

	}
}
