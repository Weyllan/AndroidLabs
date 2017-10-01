package interfaces;

import java.util.List;

import worldline.ssm.rd.ux.wltwitter.pojo.Tweet;

/**
 * Created by valbe on 29/09/2017.
 */

public interface TweetChangeListener {
    public void onTweetRetrieved(List<Tweet> tweets);
}
