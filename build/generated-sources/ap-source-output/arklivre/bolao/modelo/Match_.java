package arklivre.bolao.modelo;

import arklivre.bolao.modelo.Team;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-07-03T16:53:16")
@StaticMetamodel(Match.class)
public class Match_ { 

    public static volatile SingularAttribute<Match, Integer> id;
    public static volatile SingularAttribute<Match, Integer> idTournament;
    public static volatile SingularAttribute<Match, Team> home;
    public static volatile SingularAttribute<Match, Integer> visitorScore;
    public static volatile SingularAttribute<Match, Integer> homeScore;
    public static volatile SingularAttribute<Match, Team> visitor;
    public static volatile SingularAttribute<Match, String> info;

}