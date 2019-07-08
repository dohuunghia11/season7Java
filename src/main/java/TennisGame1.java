public class TennisGame1 {
    public static final String ZERO_SCORE = "Love";
    public static final String ONE_SCORE = "Fifteen";
    public static final String TWO_SCORE = "Thirty";
    public static final String THREE_SCORE = "Forty";
    public static String getScore(String player1Name, String player2Name, int player1_points, int player2_points) {
        String score = "";
        int tempScore=0;
        if (player1_points == player2_points)
        {
            switch (player1_points)
            {
                case 0:
                    score = ZERO_SCORE + "-All";
                    break;
                case 1:
                    score = ONE_SCORE + "-All";
                    break;
                case 2:
                    score = TWO_SCORE + "-All";
                    break;
                case 3:
                    score = THREE_SCORE + "-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (player1_points >= 4 || player2_points >= 4)
        {
            int minusResult = player1_points - player2_points;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i == 1) tempScore = player1_points;
                else { score += "-"; tempScore = player2_points;}
                switch(tempScore)
                {
                    case 0:
                        score += ZERO_SCORE;
                        break;
                    case 1:
                        score += ONE_SCORE;
                        break;
                    case 2:
                        score += TWO_SCORE;
                        break;
                    case 3:
                        score += THREE_SCORE;
                        break;
                }
            }
        }
        return score;
    }
}