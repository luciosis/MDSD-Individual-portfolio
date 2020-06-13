package org.xtext.example.domainmodel.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'Intent'", "'extends'", "'isFollowUp'", "'Entity'", "'['", "']'", "'with'", "'Training:'", "'.'", "'('", "'is'", "')'", "','"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }


    	private DomainmodelGrammarAccess grammarAccess;

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDomainmodel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleModel EOF )
            // InternalDomainmodel.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDomainmodel.g:62:1: ruleModel : ( ( rule__Model__AgentAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Model__AgentAssignment )* ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Model__AgentAssignment )* )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Model__AgentAssignment )* )
            // InternalDomainmodel.g:68:3: ( rule__Model__AgentAssignment )*
            {
             before(grammarAccess.getModelAccess().getAgentAssignment()); 
            // InternalDomainmodel.g:69:3: ( rule__Model__AgentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:69:4: rule__Model__AgentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AgentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAgentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAgent"
    // InternalDomainmodel.g:78:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( ruleAgent EOF )
            // InternalDomainmodel.g:80:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalDomainmodel.g:87:1: ruleAgent : ( ( rule__Agent__Alternatives ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__Agent__Alternatives ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__Agent__Alternatives ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__Agent__Alternatives ) )
            // InternalDomainmodel.g:93:3: ( rule__Agent__Alternatives )
            {
             before(grammarAccess.getAgentAccess().getAlternatives()); 
            // InternalDomainmodel.g:94:3: ( rule__Agent__Alternatives )
            // InternalDomainmodel.g:94:4: rule__Agent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleIntent"
    // InternalDomainmodel.g:103:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleIntent EOF )
            // InternalDomainmodel.g:105:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDomainmodel.g:112:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__Intent__Group__0 ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__Intent__Group__0 ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__Intent__Group__0 ) )
            // InternalDomainmodel.g:118:3: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // InternalDomainmodel.g:119:3: ( rule__Intent__Group__0 )
            // InternalDomainmodel.g:119:4: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleIsFollowUp"
    // InternalDomainmodel.g:128:1: entryRuleIsFollowUp : ruleIsFollowUp EOF ;
    public final void entryRuleIsFollowUp() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleIsFollowUp EOF )
            // InternalDomainmodel.g:130:1: ruleIsFollowUp EOF
            {
             before(grammarAccess.getIsFollowUpRule()); 
            pushFollow(FOLLOW_1);
            ruleIsFollowUp();

            state._fsp--;

             after(grammarAccess.getIsFollowUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsFollowUp"


    // $ANTLR start "ruleIsFollowUp"
    // InternalDomainmodel.g:137:1: ruleIsFollowUp : ( ( rule__IsFollowUp__Group__0 ) ) ;
    public final void ruleIsFollowUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__IsFollowUp__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__IsFollowUp__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__IsFollowUp__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__IsFollowUp__Group__0 )
            {
             before(grammarAccess.getIsFollowUpAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__IsFollowUp__Group__0 )
            // InternalDomainmodel.g:144:4: rule__IsFollowUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IsFollowUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIsFollowUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsFollowUp"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleEntity EOF )
            // InternalDomainmodel.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__Entity__Group__0 )
            // InternalDomainmodel.g:169:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQuestion"
    // InternalDomainmodel.g:178:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleQuestion EOF )
            // InternalDomainmodel.g:180:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalDomainmodel.g:187:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__Question__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__Question__Group__0 )
            // InternalDomainmodel.g:194:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleQuestionEntity"
    // InternalDomainmodel.g:203:1: entryRuleQuestionEntity : ruleQuestionEntity EOF ;
    public final void entryRuleQuestionEntity() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleQuestionEntity EOF )
            // InternalDomainmodel.g:205:1: ruleQuestionEntity EOF
            {
             before(grammarAccess.getQuestionEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionEntity"


    // $ANTLR start "ruleQuestionEntity"
    // InternalDomainmodel.g:212:1: ruleQuestionEntity : ( ( rule__QuestionEntity__WithEntityAssignment ) ) ;
    public final void ruleQuestionEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__QuestionEntity__WithEntityAssignment ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            // InternalDomainmodel.g:218:3: ( rule__QuestionEntity__WithEntityAssignment )
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 
            // InternalDomainmodel.g:219:3: ( rule__QuestionEntity__WithEntityAssignment )
            // InternalDomainmodel.g:219:4: rule__QuestionEntity__WithEntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QuestionEntity__WithEntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionEntity"


    // $ANTLR start "entryRuleTraining"
    // InternalDomainmodel.g:228:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalDomainmodel.g:229:1: ( ruleTraining EOF )
            // InternalDomainmodel.g:230:1: ruleTraining EOF
            {
             before(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getTrainingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalDomainmodel.g:237:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalDomainmodel.g:242:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalDomainmodel.g:242:2: ( ( rule__Training__Group__0 ) )
            // InternalDomainmodel.g:243:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalDomainmodel.g:244:3: ( rule__Training__Group__0 )
            // InternalDomainmodel.g:244:4: rule__Training__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleTrainingRef"
    // InternalDomainmodel.g:253:1: entryRuleTrainingRef : ruleTrainingRef EOF ;
    public final void entryRuleTrainingRef() throws RecognitionException {
        try {
            // InternalDomainmodel.g:254:1: ( ruleTrainingRef EOF )
            // InternalDomainmodel.g:255:1: ruleTrainingRef EOF
            {
             before(grammarAccess.getTrainingRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingRef();

            state._fsp--;

             after(grammarAccess.getTrainingRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainingRef"


    // $ANTLR start "ruleTrainingRef"
    // InternalDomainmodel.g:262:1: ruleTrainingRef : ( ( rule__TrainingRef__Group__0 ) ) ;
    public final void ruleTrainingRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:266:2: ( ( ( rule__TrainingRef__Group__0 ) ) )
            // InternalDomainmodel.g:267:2: ( ( rule__TrainingRef__Group__0 ) )
            {
            // InternalDomainmodel.g:267:2: ( ( rule__TrainingRef__Group__0 ) )
            // InternalDomainmodel.g:268:3: ( rule__TrainingRef__Group__0 )
            {
             before(grammarAccess.getTrainingRefAccess().getGroup()); 
            // InternalDomainmodel.g:269:3: ( rule__TrainingRef__Group__0 )
            // InternalDomainmodel.g:269:4: rule__TrainingRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingRef"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDomainmodel.g:278:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalDomainmodel.g:279:1: ( ruleDeclaration EOF )
            // InternalDomainmodel.g:280:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDomainmodel.g:287:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:291:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalDomainmodel.g:292:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalDomainmodel.g:292:2: ( ( rule__Declaration__Group__0 ) )
            // InternalDomainmodel.g:293:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalDomainmodel.g:294:3: ( rule__Declaration__Group__0 )
            // InternalDomainmodel.g:294:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntityExample"
    // InternalDomainmodel.g:303:1: entryRuleEntityExample : ruleEntityExample EOF ;
    public final void entryRuleEntityExample() throws RecognitionException {
        try {
            // InternalDomainmodel.g:304:1: ( ruleEntityExample EOF )
            // InternalDomainmodel.g:305:1: ruleEntityExample EOF
            {
             before(grammarAccess.getEntityExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityExampleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityExample"


    // $ANTLR start "ruleEntityExample"
    // InternalDomainmodel.g:312:1: ruleEntityExample : ( ( rule__EntityExample__Group__0 ) ) ;
    public final void ruleEntityExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:316:2: ( ( ( rule__EntityExample__Group__0 ) ) )
            // InternalDomainmodel.g:317:2: ( ( rule__EntityExample__Group__0 ) )
            {
            // InternalDomainmodel.g:317:2: ( ( rule__EntityExample__Group__0 ) )
            // InternalDomainmodel.g:318:3: ( rule__EntityExample__Group__0 )
            {
             before(grammarAccess.getEntityExampleAccess().getGroup()); 
            // InternalDomainmodel.g:319:3: ( rule__EntityExample__Group__0 )
            // InternalDomainmodel.g:319:4: rule__EntityExample__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityExample"


    // $ANTLR start "entryRuleSysvariable"
    // InternalDomainmodel.g:328:1: entryRuleSysvariable : ruleSysvariable EOF ;
    public final void entryRuleSysvariable() throws RecognitionException {
        try {
            // InternalDomainmodel.g:329:1: ( ruleSysvariable EOF )
            // InternalDomainmodel.g:330:1: ruleSysvariable EOF
            {
             before(grammarAccess.getSysvariableRule()); 
            pushFollow(FOLLOW_1);
            ruleSysvariable();

            state._fsp--;

             after(grammarAccess.getSysvariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSysvariable"


    // $ANTLR start "ruleSysvariable"
    // InternalDomainmodel.g:337:1: ruleSysvariable : ( ( rule__Sysvariable__ValueAssignment ) ) ;
    public final void ruleSysvariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:341:2: ( ( ( rule__Sysvariable__ValueAssignment ) ) )
            // InternalDomainmodel.g:342:2: ( ( rule__Sysvariable__ValueAssignment ) )
            {
            // InternalDomainmodel.g:342:2: ( ( rule__Sysvariable__ValueAssignment ) )
            // InternalDomainmodel.g:343:3: ( rule__Sysvariable__ValueAssignment )
            {
             before(grammarAccess.getSysvariableAccess().getValueAssignment()); 
            // InternalDomainmodel.g:344:3: ( rule__Sysvariable__ValueAssignment )
            // InternalDomainmodel.g:344:4: rule__Sysvariable__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSysvariable"


    // $ANTLR start "entryRuleReference"
    // InternalDomainmodel.g:353:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDomainmodel.g:354:1: ( ruleReference EOF )
            // InternalDomainmodel.g:355:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDomainmodel.g:362:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:366:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalDomainmodel.g:367:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalDomainmodel.g:367:2: ( ( rule__Reference__Alternatives ) )
            // InternalDomainmodel.g:368:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalDomainmodel.g:369:3: ( rule__Reference__Alternatives )
            // InternalDomainmodel.g:369:4: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Agent__Alternatives"
    // InternalDomainmodel.g:377:1: rule__Agent__Alternatives : ( ( ruleEntity ) | ( ruleIntent ) );
    public final void rule__Agent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:381:1: ( ( ruleEntity ) | ( ruleIntent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomainmodel.g:382:2: ( ruleEntity )
                    {
                    // InternalDomainmodel.g:382:2: ( ruleEntity )
                    // InternalDomainmodel.g:383:3: ruleEntity
                    {
                     before(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:388:2: ( ruleIntent )
                    {
                    // InternalDomainmodel.g:388:2: ( ruleIntent )
                    // InternalDomainmodel.g:389:3: ruleIntent
                    {
                     before(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntent();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Agent__Alternatives"


    // $ANTLR start "rule__Sysvariable__ValueAlternatives_0"
    // InternalDomainmodel.g:398:1: rule__Sysvariable__ValueAlternatives_0 : ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) );
    public final void rule__Sysvariable__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:402:1: ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) )
            int alt3=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            case 20:
                {
                alt3=10;
                }
                break;
            case 21:
                {
                alt3=11;
                }
                break;
            case 22:
                {
                alt3=12;
                }
                break;
            case 23:
                {
                alt3=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:403:2: ( 'number' )
                    {
                    // InternalDomainmodel.g:403:2: ( 'number' )
                    // InternalDomainmodel.g:404:3: 'number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:409:2: ( 'date-time' )
                    {
                    // InternalDomainmodel.g:409:2: ( 'date-time' )
                    // InternalDomainmodel.g:410:3: 'date-time'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:415:2: ( 'date' )
                    {
                    // InternalDomainmodel.g:415:2: ( 'date' )
                    // InternalDomainmodel.g:416:3: 'date'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:421:2: ( 'duration' )
                    {
                    // InternalDomainmodel.g:421:2: ( 'duration' )
                    // InternalDomainmodel.g:422:3: 'duration'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:427:2: ( 'address' )
                    {
                    // InternalDomainmodel.g:427:2: ( 'address' )
                    // InternalDomainmodel.g:428:3: 'address'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:433:2: ( 'email' )
                    {
                    // InternalDomainmodel.g:433:2: ( 'email' )
                    // InternalDomainmodel.g:434:3: 'email'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:439:2: ( 'phone-number' )
                    {
                    // InternalDomainmodel.g:439:2: ( 'phone-number' )
                    // InternalDomainmodel.g:440:3: 'phone-number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:445:2: ( 'date-period' )
                    {
                    // InternalDomainmodel.g:445:2: ( 'date-period' )
                    // InternalDomainmodel.g:446:3: 'date-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDomainmodel.g:451:2: ( 'time-period' )
                    {
                    // InternalDomainmodel.g:451:2: ( 'time-period' )
                    // InternalDomainmodel.g:452:3: 'time-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDomainmodel.g:457:2: ( 'url' )
                    {
                    // InternalDomainmodel.g:457:2: ( 'url' )
                    // InternalDomainmodel.g:458:3: 'url'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDomainmodel.g:463:2: ( 'any' )
                    {
                    // InternalDomainmodel.g:463:2: ( 'any' )
                    // InternalDomainmodel.g:464:3: 'any'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDomainmodel.g:469:2: ( 'color' )
                    {
                    // InternalDomainmodel.g:469:2: ( 'color' )
                    // InternalDomainmodel.g:470:3: 'color'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDomainmodel.g:475:2: ( 'language' )
                    {
                    // InternalDomainmodel.g:475:2: ( 'language' )
                    // InternalDomainmodel.g:476:3: 'language'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sysvariable__ValueAlternatives_0"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalDomainmodel.g:485:1: rule__Reference__Alternatives : ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:489:1: ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=11 && LA4_0<=23)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:490:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    {
                    // InternalDomainmodel.g:490:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    // InternalDomainmodel.g:491:3: ( rule__Reference__EntityAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 
                    // InternalDomainmodel.g:492:3: ( rule__Reference__EntityAssignment_0 )
                    // InternalDomainmodel.g:492:4: rule__Reference__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__EntityAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:496:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    {
                    // InternalDomainmodel.g:496:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    // InternalDomainmodel.g:497:3: ( rule__Reference__SysvarAssignment_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 
                    // InternalDomainmodel.g:498:3: ( rule__Reference__SysvarAssignment_1 )
                    // InternalDomainmodel.g:498:4: rule__Reference__SysvarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__SysvarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__Intent__Group__0"
    // InternalDomainmodel.g:506:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:510:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalDomainmodel.g:511:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // InternalDomainmodel.g:518:1: rule__Intent__Group__0__Impl : ( 'Intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:522:1: ( ( 'Intent' ) )
            // InternalDomainmodel.g:523:1: ( 'Intent' )
            {
            // InternalDomainmodel.g:523:1: ( 'Intent' )
            // InternalDomainmodel.g:524:2: 'Intent'
            {
             before(grammarAccess.getIntentAccess().getIntentKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getIntentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // InternalDomainmodel.g:533:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:537:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalDomainmodel.g:538:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // InternalDomainmodel.g:545:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:549:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:550:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:550:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalDomainmodel.g:551:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:552:2: ( rule__Intent__NameAssignment_1 )
            // InternalDomainmodel.g:552:3: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // InternalDomainmodel.g:560:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:564:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalDomainmodel.g:565:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // InternalDomainmodel.g:572:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Group_2__0 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:576:1: ( ( ( rule__Intent__Group_2__0 )? ) )
            // InternalDomainmodel.g:577:1: ( ( rule__Intent__Group_2__0 )? )
            {
            // InternalDomainmodel.g:577:1: ( ( rule__Intent__Group_2__0 )? )
            // InternalDomainmodel.g:578:2: ( rule__Intent__Group_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_2()); 
            // InternalDomainmodel.g:579:2: ( rule__Intent__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomainmodel.g:579:3: rule__Intent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // InternalDomainmodel.g:587:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:591:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalDomainmodel.g:592:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // InternalDomainmodel.g:599:1: rule__Intent__Group__3__Impl : ( ( rule__Intent__IsFollowUpAssignment_3 )? ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:603:1: ( ( ( rule__Intent__IsFollowUpAssignment_3 )? ) )
            // InternalDomainmodel.g:604:1: ( ( rule__Intent__IsFollowUpAssignment_3 )? )
            {
            // InternalDomainmodel.g:604:1: ( ( rule__Intent__IsFollowUpAssignment_3 )? )
            // InternalDomainmodel.g:605:2: ( rule__Intent__IsFollowUpAssignment_3 )?
            {
             before(grammarAccess.getIntentAccess().getIsFollowUpAssignment_3()); 
            // InternalDomainmodel.g:606:2: ( rule__Intent__IsFollowUpAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomainmodel.g:606:3: rule__Intent__IsFollowUpAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__IsFollowUpAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getIsFollowUpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__4"
    // InternalDomainmodel.g:614:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl rule__Intent__Group__5 ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:618:1: ( rule__Intent__Group__4__Impl rule__Intent__Group__5 )
            // InternalDomainmodel.g:619:2: rule__Intent__Group__4__Impl rule__Intent__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4"


    // $ANTLR start "rule__Intent__Group__4__Impl"
    // InternalDomainmodel.g:626:1: rule__Intent__Group__4__Impl : ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:630:1: ( ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) ) )
            // InternalDomainmodel.g:631:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            {
            // InternalDomainmodel.g:631:1: ( ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* ) )
            // InternalDomainmodel.g:632:2: ( ( rule__Intent__QuestionAssignment_4 ) ) ( ( rule__Intent__QuestionAssignment_4 )* )
            {
            // InternalDomainmodel.g:632:2: ( ( rule__Intent__QuestionAssignment_4 ) )
            // InternalDomainmodel.g:633:3: ( rule__Intent__QuestionAssignment_4 )
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalDomainmodel.g:634:3: ( rule__Intent__QuestionAssignment_4 )
            // InternalDomainmodel.g:634:4: rule__Intent__QuestionAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__Intent__QuestionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 

            }

            // InternalDomainmodel.g:637:2: ( ( rule__Intent__QuestionAssignment_4 )* )
            // InternalDomainmodel.g:638:3: ( rule__Intent__QuestionAssignment_4 )*
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 
            // InternalDomainmodel.g:639:3: ( rule__Intent__QuestionAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDomainmodel.g:639:4: rule__Intent__QuestionAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Intent__QuestionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getQuestionAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4__Impl"


    // $ANTLR start "rule__Intent__Group__5"
    // InternalDomainmodel.g:648:1: rule__Intent__Group__5 : rule__Intent__Group__5__Impl ;
    public final void rule__Intent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:652:1: ( rule__Intent__Group__5__Impl )
            // InternalDomainmodel.g:653:2: rule__Intent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__5"


    // $ANTLR start "rule__Intent__Group__5__Impl"
    // InternalDomainmodel.g:659:1: rule__Intent__Group__5__Impl : ( ( rule__Intent__TrainingAssignment_5 ) ) ;
    public final void rule__Intent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:663:1: ( ( ( rule__Intent__TrainingAssignment_5 ) ) )
            // InternalDomainmodel.g:664:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            {
            // InternalDomainmodel.g:664:1: ( ( rule__Intent__TrainingAssignment_5 ) )
            // InternalDomainmodel.g:665:2: ( rule__Intent__TrainingAssignment_5 )
            {
             before(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 
            // InternalDomainmodel.g:666:2: ( rule__Intent__TrainingAssignment_5 )
            // InternalDomainmodel.g:666:3: rule__Intent__TrainingAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Intent__TrainingAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getTrainingAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__5__Impl"


    // $ANTLR start "rule__Intent__Group_2__0"
    // InternalDomainmodel.g:675:1: rule__Intent__Group_2__0 : rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 ;
    public final void rule__Intent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:679:1: ( rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 )
            // InternalDomainmodel.g:680:2: rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Intent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__0"


    // $ANTLR start "rule__Intent__Group_2__0__Impl"
    // InternalDomainmodel.g:687:1: rule__Intent__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Intent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:691:1: ( ( 'extends' ) )
            // InternalDomainmodel.g:692:1: ( 'extends' )
            {
            // InternalDomainmodel.g:692:1: ( 'extends' )
            // InternalDomainmodel.g:693:2: 'extends'
            {
             before(grammarAccess.getIntentAccess().getExtendsKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__0__Impl"


    // $ANTLR start "rule__Intent__Group_2__1"
    // InternalDomainmodel.g:702:1: rule__Intent__Group_2__1 : rule__Intent__Group_2__1__Impl ;
    public final void rule__Intent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:706:1: ( rule__Intent__Group_2__1__Impl )
            // InternalDomainmodel.g:707:2: rule__Intent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__1"


    // $ANTLR start "rule__Intent__Group_2__1__Impl"
    // InternalDomainmodel.g:713:1: rule__Intent__Group_2__1__Impl : ( ( rule__Intent__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Intent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:717:1: ( ( ( rule__Intent__SuperTypeAssignment_2_1 ) ) )
            // InternalDomainmodel.g:718:1: ( ( rule__Intent__SuperTypeAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:718:1: ( ( rule__Intent__SuperTypeAssignment_2_1 ) )
            // InternalDomainmodel.g:719:2: ( rule__Intent__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getIntentAccess().getSuperTypeAssignment_2_1()); 
            // InternalDomainmodel.g:720:2: ( rule__Intent__SuperTypeAssignment_2_1 )
            // InternalDomainmodel.g:720:3: rule__Intent__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__1__Impl"


    // $ANTLR start "rule__IsFollowUp__Group__0"
    // InternalDomainmodel.g:729:1: rule__IsFollowUp__Group__0 : rule__IsFollowUp__Group__0__Impl rule__IsFollowUp__Group__1 ;
    public final void rule__IsFollowUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:733:1: ( rule__IsFollowUp__Group__0__Impl rule__IsFollowUp__Group__1 )
            // InternalDomainmodel.g:734:2: rule__IsFollowUp__Group__0__Impl rule__IsFollowUp__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__IsFollowUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IsFollowUp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowUp__Group__0"


    // $ANTLR start "rule__IsFollowUp__Group__0__Impl"
    // InternalDomainmodel.g:741:1: rule__IsFollowUp__Group__0__Impl : ( 'isFollowUp' ) ;
    public final void rule__IsFollowUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:745:1: ( ( 'isFollowUp' ) )
            // InternalDomainmodel.g:746:1: ( 'isFollowUp' )
            {
            // InternalDomainmodel.g:746:1: ( 'isFollowUp' )
            // InternalDomainmodel.g:747:2: 'isFollowUp'
            {
             before(grammarAccess.getIsFollowUpAccess().getIsFollowUpKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIsFollowUpAccess().getIsFollowUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowUp__Group__0__Impl"


    // $ANTLR start "rule__IsFollowUp__Group__1"
    // InternalDomainmodel.g:756:1: rule__IsFollowUp__Group__1 : rule__IsFollowUp__Group__1__Impl ;
    public final void rule__IsFollowUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:760:1: ( rule__IsFollowUp__Group__1__Impl )
            // InternalDomainmodel.g:761:2: rule__IsFollowUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IsFollowUp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowUp__Group__1"


    // $ANTLR start "rule__IsFollowUp__Group__1__Impl"
    // InternalDomainmodel.g:767:1: rule__IsFollowUp__Group__1__Impl : ( ( rule__IsFollowUp__IntentAssignment_1 ) ) ;
    public final void rule__IsFollowUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:771:1: ( ( ( rule__IsFollowUp__IntentAssignment_1 ) ) )
            // InternalDomainmodel.g:772:1: ( ( rule__IsFollowUp__IntentAssignment_1 ) )
            {
            // InternalDomainmodel.g:772:1: ( ( rule__IsFollowUp__IntentAssignment_1 ) )
            // InternalDomainmodel.g:773:2: ( rule__IsFollowUp__IntentAssignment_1 )
            {
             before(grammarAccess.getIsFollowUpAccess().getIntentAssignment_1()); 
            // InternalDomainmodel.g:774:2: ( rule__IsFollowUp__IntentAssignment_1 )
            // InternalDomainmodel.g:774:3: rule__IsFollowUp__IntentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IsFollowUp__IntentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIsFollowUpAccess().getIntentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowUp__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomainmodel.g:783:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:787:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomainmodel.g:788:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomainmodel.g:795:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:799:1: ( ( 'Entity' ) )
            // InternalDomainmodel.g:800:1: ( 'Entity' )
            {
            // InternalDomainmodel.g:800:1: ( 'Entity' )
            // InternalDomainmodel.g:801:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomainmodel.g:810:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:814:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomainmodel.g:815:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomainmodel.g:822:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:826:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:827:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:827:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDomainmodel.g:828:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:829:2: ( rule__Entity__NameAssignment_1 )
            // InternalDomainmodel.g:829:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomainmodel.g:837:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:841:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomainmodel.g:842:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomainmodel.g:849:1: rule__Entity__Group__2__Impl : ( '[' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:853:1: ( ( '[' ) )
            // InternalDomainmodel.g:854:1: ( '[' )
            {
            // InternalDomainmodel.g:854:1: ( '[' )
            // InternalDomainmodel.g:855:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomainmodel.g:864:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:868:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomainmodel.g:869:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomainmodel.g:876:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:880:1: ( ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) )
            // InternalDomainmodel.g:881:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            {
            // InternalDomainmodel.g:881:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            // InternalDomainmodel.g:882:2: ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* )
            {
            // InternalDomainmodel.g:882:2: ( ( rule__Entity__ExampleAssignment_3 ) )
            // InternalDomainmodel.g:883:3: ( rule__Entity__ExampleAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalDomainmodel.g:884:3: ( rule__Entity__ExampleAssignment_3 )
            // InternalDomainmodel.g:884:4: rule__Entity__ExampleAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__ExampleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }

            // InternalDomainmodel.g:887:2: ( ( rule__Entity__ExampleAssignment_3 )* )
            // InternalDomainmodel.g:888:3: ( rule__Entity__ExampleAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalDomainmodel.g:889:3: ( rule__Entity__ExampleAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomainmodel.g:889:4: rule__Entity__ExampleAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__ExampleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomainmodel.g:898:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:902:1: ( rule__Entity__Group__4__Impl )
            // InternalDomainmodel.g:903:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomainmodel.g:909:1: rule__Entity__Group__4__Impl : ( ']' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:913:1: ( ( ']' ) )
            // InternalDomainmodel.g:914:1: ( ']' )
            {
            // InternalDomainmodel.g:914:1: ( ']' )
            // InternalDomainmodel.g:915:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalDomainmodel.g:925:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:929:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalDomainmodel.g:930:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalDomainmodel.g:937:1: rule__Question__Group__0__Impl : ( ( rule__Question__QuestionEntityAssignment_0 ) ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:941:1: ( ( ( rule__Question__QuestionEntityAssignment_0 ) ) )
            // InternalDomainmodel.g:942:1: ( ( rule__Question__QuestionEntityAssignment_0 ) )
            {
            // InternalDomainmodel.g:942:1: ( ( rule__Question__QuestionEntityAssignment_0 ) )
            // InternalDomainmodel.g:943:2: ( rule__Question__QuestionEntityAssignment_0 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); 
            // InternalDomainmodel.g:944:2: ( rule__Question__QuestionEntityAssignment_0 )
            // InternalDomainmodel.g:944:3: rule__Question__QuestionEntityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionEntityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalDomainmodel.g:952:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:956:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalDomainmodel.g:957:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalDomainmodel.g:964:1: rule__Question__Group__1__Impl : ( 'with' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:968:1: ( ( 'with' ) )
            // InternalDomainmodel.g:969:1: ( 'with' )
            {
            // InternalDomainmodel.g:969:1: ( 'with' )
            // InternalDomainmodel.g:970:2: 'with'
            {
             before(grammarAccess.getQuestionAccess().getWithKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getWithKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalDomainmodel.g:979:1: rule__Question__Group__2 : rule__Question__Group__2__Impl ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:983:1: ( rule__Question__Group__2__Impl )
            // InternalDomainmodel.g:984:2: rule__Question__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalDomainmodel.g:990:1: rule__Question__Group__2__Impl : ( ( rule__Question__PromptAssignment_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:994:1: ( ( ( rule__Question__PromptAssignment_2 ) ) )
            // InternalDomainmodel.g:995:1: ( ( rule__Question__PromptAssignment_2 ) )
            {
            // InternalDomainmodel.g:995:1: ( ( rule__Question__PromptAssignment_2 ) )
            // InternalDomainmodel.g:996:2: ( rule__Question__PromptAssignment_2 )
            {
             before(grammarAccess.getQuestionAccess().getPromptAssignment_2()); 
            // InternalDomainmodel.g:997:2: ( rule__Question__PromptAssignment_2 )
            // InternalDomainmodel.g:997:3: rule__Question__PromptAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Question__PromptAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getPromptAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalDomainmodel.g:1006:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1010:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalDomainmodel.g:1011:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Training__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0"


    // $ANTLR start "rule__Training__Group__0__Impl"
    // InternalDomainmodel.g:1018:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1022:1: ( ( () ) )
            // InternalDomainmodel.g:1023:1: ( () )
            {
            // InternalDomainmodel.g:1023:1: ( () )
            // InternalDomainmodel.g:1024:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalDomainmodel.g:1025:2: ()
            // InternalDomainmodel.g:1025:3: 
            {
            }

             after(grammarAccess.getTrainingAccess().getTrainingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0__Impl"


    // $ANTLR start "rule__Training__Group__1"
    // InternalDomainmodel.g:1033:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1037:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalDomainmodel.g:1038:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Training__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1"


    // $ANTLR start "rule__Training__Group__1__Impl"
    // InternalDomainmodel.g:1045:1: rule__Training__Group__1__Impl : ( 'Training:' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1049:1: ( ( 'Training:' ) )
            // InternalDomainmodel.g:1050:1: ( 'Training:' )
            {
            // InternalDomainmodel.g:1050:1: ( 'Training:' )
            // InternalDomainmodel.g:1051:2: 'Training:'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__2"
    // InternalDomainmodel.g:1060:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1064:1: ( rule__Training__Group__2__Impl )
            // InternalDomainmodel.g:1065:2: rule__Training__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2"


    // $ANTLR start "rule__Training__Group__2__Impl"
    // InternalDomainmodel.g:1071:1: rule__Training__Group__2__Impl : ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1075:1: ( ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) )
            // InternalDomainmodel.g:1076:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            {
            // InternalDomainmodel.g:1076:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            // InternalDomainmodel.g:1077:2: ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* )
            {
            // InternalDomainmodel.g:1077:2: ( ( rule__Training__TrainingrefAssignment_2 ) )
            // InternalDomainmodel.g:1078:3: ( rule__Training__TrainingrefAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalDomainmodel.g:1079:3: ( rule__Training__TrainingrefAssignment_2 )
            // InternalDomainmodel.g:1079:4: rule__Training__TrainingrefAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__Training__TrainingrefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }

            // InternalDomainmodel.g:1082:2: ( ( rule__Training__TrainingrefAssignment_2 )* )
            // InternalDomainmodel.g:1083:3: ( rule__Training__TrainingrefAssignment_2 )*
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalDomainmodel.g:1084:3: ( rule__Training__TrainingrefAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomainmodel.g:1084:4: rule__Training__TrainingrefAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Training__TrainingrefAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2__Impl"


    // $ANTLR start "rule__TrainingRef__Group__0"
    // InternalDomainmodel.g:1094:1: rule__TrainingRef__Group__0 : rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 ;
    public final void rule__TrainingRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1098:1: ( rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 )
            // InternalDomainmodel.g:1099:2: rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TrainingRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__0"


    // $ANTLR start "rule__TrainingRef__Group__0__Impl"
    // InternalDomainmodel.g:1106:1: rule__TrainingRef__Group__0__Impl : ( ( rule__TrainingRef__PhraseAssignment_0 ) ) ;
    public final void rule__TrainingRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1110:1: ( ( ( rule__TrainingRef__PhraseAssignment_0 ) ) )
            // InternalDomainmodel.g:1111:1: ( ( rule__TrainingRef__PhraseAssignment_0 ) )
            {
            // InternalDomainmodel.g:1111:1: ( ( rule__TrainingRef__PhraseAssignment_0 ) )
            // InternalDomainmodel.g:1112:2: ( rule__TrainingRef__PhraseAssignment_0 )
            {
             before(grammarAccess.getTrainingRefAccess().getPhraseAssignment_0()); 
            // InternalDomainmodel.g:1113:2: ( rule__TrainingRef__PhraseAssignment_0 )
            // InternalDomainmodel.g:1113:3: rule__TrainingRef__PhraseAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__PhraseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getPhraseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__0__Impl"


    // $ANTLR start "rule__TrainingRef__Group__1"
    // InternalDomainmodel.g:1121:1: rule__TrainingRef__Group__1 : rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 ;
    public final void rule__TrainingRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1125:1: ( rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2 )
            // InternalDomainmodel.g:1126:2: rule__TrainingRef__Group__1__Impl rule__TrainingRef__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TrainingRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__1"


    // $ANTLR start "rule__TrainingRef__Group__1__Impl"
    // InternalDomainmodel.g:1133:1: rule__TrainingRef__Group__1__Impl : ( ( rule__TrainingRef__DeclarationAssignment_1 ) ) ;
    public final void rule__TrainingRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1137:1: ( ( ( rule__TrainingRef__DeclarationAssignment_1 ) ) )
            // InternalDomainmodel.g:1138:1: ( ( rule__TrainingRef__DeclarationAssignment_1 ) )
            {
            // InternalDomainmodel.g:1138:1: ( ( rule__TrainingRef__DeclarationAssignment_1 ) )
            // InternalDomainmodel.g:1139:2: ( rule__TrainingRef__DeclarationAssignment_1 )
            {
             before(grammarAccess.getTrainingRefAccess().getDeclarationAssignment_1()); 
            // InternalDomainmodel.g:1140:2: ( rule__TrainingRef__DeclarationAssignment_1 )
            // InternalDomainmodel.g:1140:3: rule__TrainingRef__DeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__DeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getDeclarationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__1__Impl"


    // $ANTLR start "rule__TrainingRef__Group__2"
    // InternalDomainmodel.g:1148:1: rule__TrainingRef__Group__2 : rule__TrainingRef__Group__2__Impl ;
    public final void rule__TrainingRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1152:1: ( rule__TrainingRef__Group__2__Impl )
            // InternalDomainmodel.g:1153:2: rule__TrainingRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__2"


    // $ANTLR start "rule__TrainingRef__Group__2__Impl"
    // InternalDomainmodel.g:1159:1: rule__TrainingRef__Group__2__Impl : ( '.' ) ;
    public final void rule__TrainingRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1163:1: ( ( '.' ) )
            // InternalDomainmodel.g:1164:1: ( '.' )
            {
            // InternalDomainmodel.g:1164:1: ( '.' )
            // InternalDomainmodel.g:1165:2: '.'
            {
             before(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingRefAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalDomainmodel.g:1175:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1179:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalDomainmodel.g:1180:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalDomainmodel.g:1187:1: rule__Declaration__Group__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1191:1: ( ( '(' ) )
            // InternalDomainmodel.g:1192:1: ( '(' )
            {
            // InternalDomainmodel.g:1192:1: ( '(' )
            // InternalDomainmodel.g:1193:2: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalDomainmodel.g:1202:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1206:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalDomainmodel.g:1207:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalDomainmodel.g:1214:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TrainingstringAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1218:1: ( ( ( rule__Declaration__TrainingstringAssignment_1 ) ) )
            // InternalDomainmodel.g:1219:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            {
            // InternalDomainmodel.g:1219:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            // InternalDomainmodel.g:1220:2: ( rule__Declaration__TrainingstringAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 
            // InternalDomainmodel.g:1221:2: ( rule__Declaration__TrainingstringAssignment_1 )
            // InternalDomainmodel.g:1221:3: rule__Declaration__TrainingstringAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TrainingstringAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalDomainmodel.g:1229:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1233:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalDomainmodel.g:1234:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalDomainmodel.g:1241:1: rule__Declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1245:1: ( ( 'is' ) )
            // InternalDomainmodel.g:1246:1: ( 'is' )
            {
            // InternalDomainmodel.g:1246:1: ( 'is' )
            // InternalDomainmodel.g:1247:2: 'is'
            {
             before(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // InternalDomainmodel.g:1256:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1260:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalDomainmodel.g:1261:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // InternalDomainmodel.g:1268:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ReferenceAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1272:1: ( ( ( rule__Declaration__ReferenceAssignment_3 ) ) )
            // InternalDomainmodel.g:1273:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            {
            // InternalDomainmodel.g:1273:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            // InternalDomainmodel.g:1274:2: ( rule__Declaration__ReferenceAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 
            // InternalDomainmodel.g:1275:2: ( rule__Declaration__ReferenceAssignment_3 )
            // InternalDomainmodel.g:1275:3: rule__Declaration__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__4"
    // InternalDomainmodel.g:1283:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1287:1: ( rule__Declaration__Group__4__Impl )
            // InternalDomainmodel.g:1288:2: rule__Declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4"


    // $ANTLR start "rule__Declaration__Group__4__Impl"
    // InternalDomainmodel.g:1294:1: rule__Declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1298:1: ( ( ')' ) )
            // InternalDomainmodel.g:1299:1: ( ')' )
            {
            // InternalDomainmodel.g:1299:1: ( ')' )
            // InternalDomainmodel.g:1300:2: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4__Impl"


    // $ANTLR start "rule__EntityExample__Group__0"
    // InternalDomainmodel.g:1310:1: rule__EntityExample__Group__0 : rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 ;
    public final void rule__EntityExample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1314:1: ( rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 )
            // InternalDomainmodel.g:1315:2: rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__EntityExample__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__0"


    // $ANTLR start "rule__EntityExample__Group__0__Impl"
    // InternalDomainmodel.g:1322:1: rule__EntityExample__Group__0__Impl : ( ( rule__EntityExample__NameAssignment_0 ) ) ;
    public final void rule__EntityExample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1326:1: ( ( ( rule__EntityExample__NameAssignment_0 ) ) )
            // InternalDomainmodel.g:1327:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            {
            // InternalDomainmodel.g:1327:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            // InternalDomainmodel.g:1328:2: ( rule__EntityExample__NameAssignment_0 )
            {
             before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 
            // InternalDomainmodel.g:1329:2: ( rule__EntityExample__NameAssignment_0 )
            // InternalDomainmodel.g:1329:3: rule__EntityExample__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__0__Impl"


    // $ANTLR start "rule__EntityExample__Group__1"
    // InternalDomainmodel.g:1337:1: rule__EntityExample__Group__1 : rule__EntityExample__Group__1__Impl ;
    public final void rule__EntityExample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1341:1: ( rule__EntityExample__Group__1__Impl )
            // InternalDomainmodel.g:1342:2: rule__EntityExample__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__1"


    // $ANTLR start "rule__EntityExample__Group__1__Impl"
    // InternalDomainmodel.g:1348:1: rule__EntityExample__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EntityExample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1352:1: ( ( ( ',' )? ) )
            // InternalDomainmodel.g:1353:1: ( ( ',' )? )
            {
            // InternalDomainmodel.g:1353:1: ( ( ',' )? )
            // InternalDomainmodel.g:1354:2: ( ',' )?
            {
             before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 
            // InternalDomainmodel.g:1355:2: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomainmodel.g:1355:3: ','
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__1__Impl"


    // $ANTLR start "rule__Model__AgentAssignment"
    // InternalDomainmodel.g:1364:1: rule__Model__AgentAssignment : ( ruleAgent ) ;
    public final void rule__Model__AgentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1368:1: ( ( ruleAgent ) )
            // InternalDomainmodel.g:1369:2: ( ruleAgent )
            {
            // InternalDomainmodel.g:1369:2: ( ruleAgent )
            // InternalDomainmodel.g:1370:3: ruleAgent
            {
             before(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AgentAssignment"


    // $ANTLR start "rule__Intent__NameAssignment_1"
    // InternalDomainmodel.g:1379:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1383:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1384:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1384:2: ( RULE_ID )
            // InternalDomainmodel.g:1385:3: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_1"


    // $ANTLR start "rule__Intent__SuperTypeAssignment_2_1"
    // InternalDomainmodel.g:1394:1: rule__Intent__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1398:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:1399:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:1399:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1400:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getSuperTypeIntentCrossReference_2_1_0()); 
            // InternalDomainmodel.g:1401:3: ( RULE_ID )
            // InternalDomainmodel.g:1402:4: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getSuperTypeIntentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getSuperTypeIntentIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getIntentAccess().getSuperTypeIntentCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Intent__IsFollowUpAssignment_3"
    // InternalDomainmodel.g:1413:1: rule__Intent__IsFollowUpAssignment_3 : ( ruleIsFollowUp ) ;
    public final void rule__Intent__IsFollowUpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1417:1: ( ( ruleIsFollowUp ) )
            // InternalDomainmodel.g:1418:2: ( ruleIsFollowUp )
            {
            // InternalDomainmodel.g:1418:2: ( ruleIsFollowUp )
            // InternalDomainmodel.g:1419:3: ruleIsFollowUp
            {
             before(grammarAccess.getIntentAccess().getIsFollowUpIsFollowUpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIsFollowUp();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getIsFollowUpIsFollowUpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__IsFollowUpAssignment_3"


    // $ANTLR start "rule__Intent__QuestionAssignment_4"
    // InternalDomainmodel.g:1428:1: rule__Intent__QuestionAssignment_4 : ( ruleQuestion ) ;
    public final void rule__Intent__QuestionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1432:1: ( ( ruleQuestion ) )
            // InternalDomainmodel.g:1433:2: ( ruleQuestion )
            {
            // InternalDomainmodel.g:1433:2: ( ruleQuestion )
            // InternalDomainmodel.g:1434:3: ruleQuestion
            {
             before(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getQuestionQuestionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__QuestionAssignment_4"


    // $ANTLR start "rule__Intent__TrainingAssignment_5"
    // InternalDomainmodel.g:1443:1: rule__Intent__TrainingAssignment_5 : ( ruleTraining ) ;
    public final void rule__Intent__TrainingAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1447:1: ( ( ruleTraining ) )
            // InternalDomainmodel.g:1448:2: ( ruleTraining )
            {
            // InternalDomainmodel.g:1448:2: ( ruleTraining )
            // InternalDomainmodel.g:1449:3: ruleTraining
            {
             before(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__TrainingAssignment_5"


    // $ANTLR start "rule__IsFollowUp__IntentAssignment_1"
    // InternalDomainmodel.g:1458:1: rule__IsFollowUp__IntentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IsFollowUp__IntentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1462:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:1463:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:1463:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1464:3: ( RULE_ID )
            {
             before(grammarAccess.getIsFollowUpAccess().getIntentIntentCrossReference_1_0()); 
            // InternalDomainmodel.g:1465:3: ( RULE_ID )
            // InternalDomainmodel.g:1466:4: RULE_ID
            {
             before(grammarAccess.getIsFollowUpAccess().getIntentIntentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIsFollowUpAccess().getIntentIntentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIsFollowUpAccess().getIntentIntentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsFollowUp__IntentAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDomainmodel.g:1477:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1481:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1482:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1482:2: ( RULE_ID )
            // InternalDomainmodel.g:1483:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExampleAssignment_3"
    // InternalDomainmodel.g:1492:1: rule__Entity__ExampleAssignment_3 : ( ruleEntityExample ) ;
    public final void rule__Entity__ExampleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1496:1: ( ( ruleEntityExample ) )
            // InternalDomainmodel.g:1497:2: ( ruleEntityExample )
            {
            // InternalDomainmodel.g:1497:2: ( ruleEntityExample )
            // InternalDomainmodel.g:1498:3: ruleEntityExample
            {
             before(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExampleAssignment_3"


    // $ANTLR start "rule__Question__QuestionEntityAssignment_0"
    // InternalDomainmodel.g:1507:1: rule__Question__QuestionEntityAssignment_0 : ( ruleQuestionEntity ) ;
    public final void rule__Question__QuestionEntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1511:1: ( ( ruleQuestionEntity ) )
            // InternalDomainmodel.g:1512:2: ( ruleQuestionEntity )
            {
            // InternalDomainmodel.g:1512:2: ( ruleQuestionEntity )
            // InternalDomainmodel.g:1513:3: ruleQuestionEntity
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionEntityAssignment_0"


    // $ANTLR start "rule__Question__PromptAssignment_2"
    // InternalDomainmodel.g:1522:1: rule__Question__PromptAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Question__PromptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1526:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1527:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1527:2: ( RULE_STRING )
            // InternalDomainmodel.g:1528:3: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__PromptAssignment_2"


    // $ANTLR start "rule__QuestionEntity__WithEntityAssignment"
    // InternalDomainmodel.g:1537:1: rule__QuestionEntity__WithEntityAssignment : ( ruleReference ) ;
    public final void rule__QuestionEntity__WithEntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1541:1: ( ( ruleReference ) )
            // InternalDomainmodel.g:1542:2: ( ruleReference )
            {
            // InternalDomainmodel.g:1542:2: ( ruleReference )
            // InternalDomainmodel.g:1543:3: ruleReference
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionEntity__WithEntityAssignment"


    // $ANTLR start "rule__Training__TrainingrefAssignment_2"
    // InternalDomainmodel.g:1552:1: rule__Training__TrainingrefAssignment_2 : ( ruleTrainingRef ) ;
    public final void rule__Training__TrainingrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1556:1: ( ( ruleTrainingRef ) )
            // InternalDomainmodel.g:1557:2: ( ruleTrainingRef )
            {
            // InternalDomainmodel.g:1557:2: ( ruleTrainingRef )
            // InternalDomainmodel.g:1558:3: ruleTrainingRef
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainingRef();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__TrainingrefAssignment_2"


    // $ANTLR start "rule__TrainingRef__PhraseAssignment_0"
    // InternalDomainmodel.g:1567:1: rule__TrainingRef__PhraseAssignment_0 : ( RULE_STRING ) ;
    public final void rule__TrainingRef__PhraseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1571:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1572:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1572:2: ( RULE_STRING )
            // InternalDomainmodel.g:1573:3: RULE_STRING
            {
             before(grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTrainingRefAccess().getPhraseSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__PhraseAssignment_0"


    // $ANTLR start "rule__TrainingRef__DeclarationAssignment_1"
    // InternalDomainmodel.g:1582:1: rule__TrainingRef__DeclarationAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__TrainingRef__DeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1586:1: ( ( ruleDeclaration ) )
            // InternalDomainmodel.g:1587:2: ( ruleDeclaration )
            {
            // InternalDomainmodel.g:1587:2: ( ruleDeclaration )
            // InternalDomainmodel.g:1588:3: ruleDeclaration
            {
             before(grammarAccess.getTrainingRefAccess().getDeclarationDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getTrainingRefAccess().getDeclarationDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__DeclarationAssignment_1"


    // $ANTLR start "rule__Declaration__TrainingstringAssignment_1"
    // InternalDomainmodel.g:1597:1: rule__Declaration__TrainingstringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TrainingstringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1601:1: ( ( RULE_STRING ) )
            // InternalDomainmodel.g:1602:2: ( RULE_STRING )
            {
            // InternalDomainmodel.g:1602:2: ( RULE_STRING )
            // InternalDomainmodel.g:1603:3: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TrainingstringAssignment_1"


    // $ANTLR start "rule__Declaration__ReferenceAssignment_3"
    // InternalDomainmodel.g:1612:1: rule__Declaration__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Declaration__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1616:1: ( ( ruleReference ) )
            // InternalDomainmodel.g:1617:2: ( ruleReference )
            {
            // InternalDomainmodel.g:1617:2: ( ruleReference )
            // InternalDomainmodel.g:1618:3: ruleReference
            {
             before(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ReferenceAssignment_3"


    // $ANTLR start "rule__EntityExample__NameAssignment_0"
    // InternalDomainmodel.g:1627:1: rule__EntityExample__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityExample__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1631:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1632:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1632:2: ( RULE_ID )
            // InternalDomainmodel.g:1633:3: RULE_ID
            {
             before(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__NameAssignment_0"


    // $ANTLR start "rule__Sysvariable__ValueAssignment"
    // InternalDomainmodel.g:1642:1: rule__Sysvariable__ValueAssignment : ( ( rule__Sysvariable__ValueAlternatives_0 ) ) ;
    public final void rule__Sysvariable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1646:1: ( ( ( rule__Sysvariable__ValueAlternatives_0 ) ) )
            // InternalDomainmodel.g:1647:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            {
            // InternalDomainmodel.g:1647:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            // InternalDomainmodel.g:1648:3: ( rule__Sysvariable__ValueAlternatives_0 )
            {
             before(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 
            // InternalDomainmodel.g:1649:3: ( rule__Sysvariable__ValueAlternatives_0 )
            // InternalDomainmodel.g:1649:4: rule__Sysvariable__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sysvariable__ValueAssignment"


    // $ANTLR start "rule__Reference__EntityAssignment_0"
    // InternalDomainmodel.g:1657:1: rule__Reference__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1661:1: ( ( ( RULE_ID ) ) )
            // InternalDomainmodel.g:1662:2: ( ( RULE_ID ) )
            {
            // InternalDomainmodel.g:1662:2: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1663:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 
            // InternalDomainmodel.g:1664:3: ( RULE_ID )
            // InternalDomainmodel.g:1665:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__EntityAssignment_0"


    // $ANTLR start "rule__Reference__SysvarAssignment_1"
    // InternalDomainmodel.g:1676:1: rule__Reference__SysvarAssignment_1 : ( ruleSysvariable ) ;
    public final void rule__Reference__SysvarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1680:1: ( ( ruleSysvariable ) )
            // InternalDomainmodel.g:1681:2: ( ruleSysvariable )
            {
            // InternalDomainmodel.g:1681:2: ( ruleSysvariable )
            // InternalDomainmodel.g:1682:3: ruleSysvariable
            {
             before(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSysvariable();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SysvarAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006FFF810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006FFF812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});

}