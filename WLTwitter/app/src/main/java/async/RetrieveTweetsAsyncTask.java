package async;

import android.os.AsyncTask;

import java.util.List;

import worldline.ssm.rd.ux.wltwitter.helpers.TwitterHelper;
import worldline.ssm.rd.ux.wltwitter.pojo.Tweet;
import worldline.ssm.rd.ux.wltwitter.ui.fragments.TweetsFragment;
import worldline.ssm.rd.ux.wltwitter.utils.Constants;

/**
 * Created by valbe on 29/09/2017.
 */

public class RetrieveTweetsAsyncTask extends AsyncTask<String, Void, List<Tweet>> {

    TweetsFragment listener;

    public RetrieveTweetsAsyncTask(TweetsFragment listener) {
        this.listener = listener;
    }

    @Override
    protected List<Tweet> doInBackground(String... strings) {
        if(strings != null){
            return TwitterHelper.getTweetsOfUser(strings[0]);
        }else{
            return null;
        }
    }

    @Override
    protected void onPostExecute(List<Tweet> tweets) {
        super.onPostExecute(tweets);
        for(int i = 0; i < tweets.size(); i++){
            System.out.println("[WLTwitter]"+tweets.get(i).text);
        }
        if(this.listener != null){
            this.listener.onTweetRetrieved(tweets);
        }
    }
}
