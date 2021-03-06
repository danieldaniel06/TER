package com.aelos.xtext.testintentionsassistance.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.aelos.xtext.testintentionsassistance.services.TestintentionsAssistanceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestintentionsAssistanceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'{'", "'}'", "'.'", "'import'", "'.*'", "','", "'='", "'('", "')'", "'input:('", "':'", "':='", "'description:'", "'datapredicate:'", "'oracle:'", "'\\u2228'", "'\\u2227'", "'<>'", "'\\u2265'", "'\\u2264'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'!'", "'INT'", "'STRING'", "'Boolean'", "'Double'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTestintentionsAssistanceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTestintentionsAssistanceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTestintentionsAssistanceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTestintentionsAssistance.g"; }



     	private TestintentionsAssistanceGrammarAccess grammarAccess;

        public InternalTestintentionsAssistanceParser(TokenStream input, TestintentionsAssistanceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected TestintentionsAssistanceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalTestintentionsAssistance.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalTestintentionsAssistance.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalTestintentionsAssistance.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalTestintentionsAssistance.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleDomainDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:78:2: ( ( (lv_elements_0_0= ruleDomainDeclaration ) )* )
            // InternalTestintentionsAssistance.g:79:2: ( (lv_elements_0_0= ruleDomainDeclaration ) )*
            {
            // InternalTestintentionsAssistance.g:79:2: ( (lv_elements_0_0= ruleDomainDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:80:3: (lv_elements_0_0= ruleDomainDeclaration )
            	    {
            	    // InternalTestintentionsAssistance.g:80:3: (lv_elements_0_0= ruleDomainDeclaration )
            	    // InternalTestintentionsAssistance.g:81:4: lv_elements_0_0= ruleDomainDeclaration
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsDomainDeclarationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleDomainDeclaration();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.DomainDeclaration");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalTestintentionsAssistance.g:101:1: entryRuleDomainDeclaration returns [EObject current=null] : iv_ruleDomainDeclaration= ruleDomainDeclaration EOF ;
    public final EObject entryRuleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDeclaration = null;


        try {
            // InternalTestintentionsAssistance.g:101:58: (iv_ruleDomainDeclaration= ruleDomainDeclaration EOF )
            // InternalTestintentionsAssistance.g:102:2: iv_ruleDomainDeclaration= ruleDomainDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDomainDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainDeclaration=ruleDomainDeclaration();

            state._fsp--;

             current =iv_ruleDomainDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainDeclaration"


    // $ANTLR start "ruleDomainDeclaration"
    // InternalTestintentionsAssistance.g:108:1: ruleDomainDeclaration returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:114:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // InternalTestintentionsAssistance.g:115:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // InternalTestintentionsAssistance.g:115:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // InternalTestintentionsAssistance.g:116:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0());
            		
            // InternalTestintentionsAssistance.g:120:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:121:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:121:4: (lv_name_1_0= ruleQualifiedName )
            // InternalTestintentionsAssistance.g:122:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalTestintentionsAssistance.g:143:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==11||LA2_0==15||LA2_0==21||LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:144:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // InternalTestintentionsAssistance.g:144:4: (lv_elements_3_0= ruleAbstractElement )
            	    // InternalTestintentionsAssistance.g:145:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getDomainDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.AbstractElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainDeclaration"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTestintentionsAssistance.g:170:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalTestintentionsAssistance.g:170:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTestintentionsAssistance.g:171:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalTestintentionsAssistance.g:177:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:183:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalTestintentionsAssistance.g:184:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalTestintentionsAssistance.g:184:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalTestintentionsAssistance.g:185:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalTestintentionsAssistance.g:192:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:193:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalTestintentionsAssistance.g:210:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTestintentionsAssistance.g:210:47: (iv_ruleImport= ruleImport EOF )
            // InternalTestintentionsAssistance.g:211:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTestintentionsAssistance.g:217:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:223:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalTestintentionsAssistance.g:224:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalTestintentionsAssistance.g:224:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalTestintentionsAssistance.g:225:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalTestintentionsAssistance.g:229:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalTestintentionsAssistance.g:230:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalTestintentionsAssistance.g:230:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalTestintentionsAssistance.g:231:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalTestintentionsAssistance.g:252:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalTestintentionsAssistance.g:252:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalTestintentionsAssistance.g:253:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalTestintentionsAssistance.g:259:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:265:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalTestintentionsAssistance.g:266:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalTestintentionsAssistance.g:266:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalTestintentionsAssistance.g:267:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:277:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTestintentionsAssistance.g:278:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalTestintentionsAssistance.g:288:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalTestintentionsAssistance.g:288:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalTestintentionsAssistance.g:289:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalTestintentionsAssistance.g:295:1: ruleAbstractElement returns [EObject current=null] : (this_TestIntention_0= ruleTestIntention | this_Function_1= ruleFunction | this_Data_2= ruleData | this_Import_3= ruleImport | this_DomainDeclaration_4= ruleDomainDeclaration ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_TestIntention_0 = null;

        EObject this_Function_1 = null;

        EObject this_Data_2 = null;

        EObject this_Import_3 = null;

        EObject this_DomainDeclaration_4 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:301:2: ( (this_TestIntention_0= ruleTestIntention | this_Function_1= ruleFunction | this_Data_2= ruleData | this_Import_3= ruleImport | this_DomainDeclaration_4= ruleDomainDeclaration ) )
            // InternalTestintentionsAssistance.g:302:2: (this_TestIntention_0= ruleTestIntention | this_Function_1= ruleFunction | this_Data_2= ruleData | this_Import_3= ruleImport | this_DomainDeclaration_4= ruleDomainDeclaration )
            {
            // InternalTestintentionsAssistance.g:302:2: (this_TestIntention_0= ruleTestIntention | this_Function_1= ruleFunction | this_Data_2= ruleData | this_Import_3= ruleImport | this_DomainDeclaration_4= ruleDomainDeclaration )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalTestintentionsAssistance.g:303:3: this_TestIntention_0= ruleTestIntention
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getTestIntentionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TestIntention_0=ruleTestIntention();

                    state._fsp--;


                    			current = this_TestIntention_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:312:3: this_Function_1= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_1=ruleFunction();

                    state._fsp--;


                    			current = this_Function_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:321:3: this_Data_2= ruleData
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDataParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Data_2=ruleData();

                    state._fsp--;


                    			current = this_Data_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:330:3: this_Import_3= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_3=ruleImport();

                    state._fsp--;


                    			current = this_Import_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalTestintentionsAssistance.g:339:3: this_DomainDeclaration_4= ruleDomainDeclaration
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getDomainDeclarationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainDeclaration_4=ruleDomainDeclaration();

                    state._fsp--;


                    			current = this_DomainDeclaration_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleFunction"
    // InternalTestintentionsAssistance.g:351:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalTestintentionsAssistance.g:351:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalTestintentionsAssistance.g:352:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalTestintentionsAssistance.g:358:1: ruleFunction returns [EObject current=null] : ( ( (lv_out_0_0= ruleOutVariable ) ) (otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) ) )* otherlv_3= '=' ( (lv_methode_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_methode_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_out_0_0 = null;

        EObject lv_out_2_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:364:2: ( ( ( (lv_out_0_0= ruleOutVariable ) ) (otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) ) )* otherlv_3= '=' ( (lv_methode_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) )
            // InternalTestintentionsAssistance.g:365:2: ( ( (lv_out_0_0= ruleOutVariable ) ) (otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) ) )* otherlv_3= '=' ( (lv_methode_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            {
            // InternalTestintentionsAssistance.g:365:2: ( ( (lv_out_0_0= ruleOutVariable ) ) (otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) ) )* otherlv_3= '=' ( (lv_methode_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
            // InternalTestintentionsAssistance.g:366:3: ( (lv_out_0_0= ruleOutVariable ) ) (otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) ) )* otherlv_3= '=' ( (lv_methode_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )* ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
            {
            // InternalTestintentionsAssistance.g:366:3: ( (lv_out_0_0= ruleOutVariable ) )
            // InternalTestintentionsAssistance.g:367:4: (lv_out_0_0= ruleOutVariable )
            {
            // InternalTestintentionsAssistance.g:367:4: (lv_out_0_0= ruleOutVariable )
            // InternalTestintentionsAssistance.g:368:5: lv_out_0_0= ruleOutVariable
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getOutOutVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_out_0_0=ruleOutVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					add(
            						current,
            						"out",
            						lv_out_0_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.OutVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTestintentionsAssistance.g:385:3: (otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:386:4: otherlv_1= ',' ( (lv_out_2_0= ruleOutVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalTestintentionsAssistance.g:390:4: ( (lv_out_2_0= ruleOutVariable ) )
            	    // InternalTestintentionsAssistance.g:391:5: (lv_out_2_0= ruleOutVariable )
            	    {
            	    // InternalTestintentionsAssistance.g:391:5: (lv_out_2_0= ruleOutVariable )
            	    // InternalTestintentionsAssistance.g:392:6: lv_out_2_0= ruleOutVariable
            	    {

            	    						newCompositeNode(grammarAccess.getFunctionAccess().getOutOutVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_out_2_0=ruleOutVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"out",
            	    							lv_out_2_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.OutVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getEqualsSignKeyword_2());
            		
            // InternalTestintentionsAssistance.g:414:3: ( (lv_methode_4_0= RULE_ID ) )
            // InternalTestintentionsAssistance.g:415:4: (lv_methode_4_0= RULE_ID )
            {
            // InternalTestintentionsAssistance.g:415:4: (lv_methode_4_0= RULE_ID )
            // InternalTestintentionsAssistance.g:416:5: lv_methode_4_0= RULE_ID
            {
            lv_methode_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_methode_4_0, grammarAccess.getFunctionAccess().getMethodeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"methode",
            						lv_methode_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTestintentionsAssistance.g:436:3: ( ( (otherlv_6= RULE_ID ) ) otherlv_7= ',' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==17) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:437:4: ( (otherlv_6= RULE_ID ) ) otherlv_7= ','
            	    {
            	    // InternalTestintentionsAssistance.g:437:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalTestintentionsAssistance.g:438:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalTestintentionsAssistance.g:438:5: (otherlv_6= RULE_ID )
            	    // InternalTestintentionsAssistance.g:439:6: otherlv_6= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFunctionRule());
            	    						}
            	    					
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getArgVariableCrossReference_5_0_0());
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getCommaKeyword_5_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalTestintentionsAssistance.g:455:3: ( (otherlv_8= RULE_ID ) )
            // InternalTestintentionsAssistance.g:456:4: (otherlv_8= RULE_ID )
            {
            // InternalTestintentionsAssistance.g:456:4: (otherlv_8= RULE_ID )
            // InternalTestintentionsAssistance.g:457:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getArg1VariableCrossReference_6_0());
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleData"
    // InternalTestintentionsAssistance.g:476:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalTestintentionsAssistance.g:476:45: (iv_ruleData= ruleData EOF )
            // InternalTestintentionsAssistance.g:477:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalTestintentionsAssistance.g:483:1: ruleData returns [EObject current=null] : ( ( () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )* ) | ( ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )* ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inst_2_0 = null;

        EObject lv_inst_4_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:489:2: ( ( ( () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )* ) | ( ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )* ) ) )
            // InternalTestintentionsAssistance.g:490:2: ( ( () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )* ) | ( ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )* ) )
            {
            // InternalTestintentionsAssistance.g:490:2: ( ( () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )* ) | ( ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )* ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTestintentionsAssistance.g:491:3: ( () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )* )
                    {
                    // InternalTestintentionsAssistance.g:491:3: ( () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )* )
                    // InternalTestintentionsAssistance.g:492:4: () otherlv_1= 'input:(' ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )*
                    {
                    // InternalTestintentionsAssistance.g:492:4: ()
                    // InternalTestintentionsAssistance.g:493:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDataAccess().getDataAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getDataAccess().getInputKeyword_0_1());
                    			
                    // InternalTestintentionsAssistance.g:503:4: ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )*
                    loop8:
                    do {
                        int alt8=2;
                        alt8 = dfa8.predict(input);
                        switch (alt8) {
                    	case 1 :
                    	    // InternalTestintentionsAssistance.g:504:5: ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ','
                    	    {
                    	    // InternalTestintentionsAssistance.g:504:5: ( (lv_inst_2_0= ruleInst ) )
                    	    // InternalTestintentionsAssistance.g:505:6: (lv_inst_2_0= ruleInst )
                    	    {
                    	    // InternalTestintentionsAssistance.g:505:6: (lv_inst_2_0= ruleInst )
                    	    // InternalTestintentionsAssistance.g:506:7: lv_inst_2_0= ruleInst
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataAccess().getInstInstParserRuleCall_0_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_inst_2_0=ruleInst();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inst",
                    	    								lv_inst_2_0,
                    	    								"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Inst");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getDataAccess().getCommaKeyword_0_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:530:3: ( ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )* )
                    {
                    // InternalTestintentionsAssistance.g:530:3: ( ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )* )
                    // InternalTestintentionsAssistance.g:531:4: ( (lv_inst_4_0= ruleInst ) ) (otherlv_5= ')' )*
                    {
                    // InternalTestintentionsAssistance.g:531:4: ( (lv_inst_4_0= ruleInst ) )
                    // InternalTestintentionsAssistance.g:532:5: (lv_inst_4_0= ruleInst )
                    {
                    // InternalTestintentionsAssistance.g:532:5: (lv_inst_4_0= ruleInst )
                    // InternalTestintentionsAssistance.g:533:6: lv_inst_4_0= ruleInst
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getInstInstParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_inst_4_0=ruleInst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						add(
                    							current,
                    							"inst",
                    							lv_inst_4_0,
                    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Inst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTestintentionsAssistance.g:550:4: (otherlv_5= ')' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalTestintentionsAssistance.g:551:5: otherlv_5= ')'
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_14); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataAccess().getRightParenthesisKeyword_1_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleOutVariable"
    // InternalTestintentionsAssistance.g:561:1: entryRuleOutVariable returns [EObject current=null] : iv_ruleOutVariable= ruleOutVariable EOF ;
    public final EObject entryRuleOutVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutVariable = null;


        try {
            // InternalTestintentionsAssistance.g:561:52: (iv_ruleOutVariable= ruleOutVariable EOF )
            // InternalTestintentionsAssistance.g:562:2: iv_ruleOutVariable= ruleOutVariable EOF
            {
             newCompositeNode(grammarAccess.getOutVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutVariable=ruleOutVariable();

            state._fsp--;

             current =iv_ruleOutVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutVariable"


    // $ANTLR start "ruleOutVariable"
    // InternalTestintentionsAssistance.g:568:1: ruleOutVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleOutVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:574:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalTestintentionsAssistance.g:575:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalTestintentionsAssistance.g:575:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalTestintentionsAssistance.g:576:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalTestintentionsAssistance.g:576:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTestintentionsAssistance.g:577:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTestintentionsAssistance.g:577:4: (lv_name_0_0= RULE_ID )
            // InternalTestintentionsAssistance.g:578:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOutVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getOutVariableAccess().getColonKeyword_1());
            		
            // InternalTestintentionsAssistance.g:598:3: ( (lv_type_2_0= ruleType ) )
            // InternalTestintentionsAssistance.g:599:4: (lv_type_2_0= ruleType )
            {
            // InternalTestintentionsAssistance.g:599:4: (lv_type_2_0= ruleType )
            // InternalTestintentionsAssistance.g:600:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getOutVariableAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutVariable"


    // $ANTLR start "entryRuleInst"
    // InternalTestintentionsAssistance.g:621:1: entryRuleInst returns [EObject current=null] : iv_ruleInst= ruleInst EOF ;
    public final EObject entryRuleInst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst = null;


        try {
            // InternalTestintentionsAssistance.g:621:45: (iv_ruleInst= ruleInst EOF )
            // InternalTestintentionsAssistance.g:622:2: iv_ruleInst= ruleInst EOF
            {
             newCompositeNode(grammarAccess.getInstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst=ruleInst();

            state._fsp--;

             current =iv_ruleInst; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInst"


    // $ANTLR start "ruleInst"
    // InternalTestintentionsAssistance.g:628:1: ruleInst returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleAtomic ) ) ) ;
    public final EObject ruleInst() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        EObject lv_valeur_2_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:634:2: ( ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleAtomic ) ) ) )
            // InternalTestintentionsAssistance.g:635:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleAtomic ) ) )
            {
            // InternalTestintentionsAssistance.g:635:2: ( ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleAtomic ) ) )
            // InternalTestintentionsAssistance.g:636:3: ( (lv_variable_0_0= ruleVariable ) ) otherlv_1= ':=' ( (lv_valeur_2_0= ruleAtomic ) )
            {
            // InternalTestintentionsAssistance.g:636:3: ( (lv_variable_0_0= ruleVariable ) )
            // InternalTestintentionsAssistance.g:637:4: (lv_variable_0_0= ruleVariable )
            {
            // InternalTestintentionsAssistance.g:637:4: (lv_variable_0_0= ruleVariable )
            // InternalTestintentionsAssistance.g:638:5: lv_variable_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getInstAccess().getVariableVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_variable_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstRule());
            					}
            					add(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInstAccess().getColonEqualsSignKeyword_1());
            		
            // InternalTestintentionsAssistance.g:659:3: ( (lv_valeur_2_0= ruleAtomic ) )
            // InternalTestintentionsAssistance.g:660:4: (lv_valeur_2_0= ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:660:4: (lv_valeur_2_0= ruleAtomic )
            // InternalTestintentionsAssistance.g:661:5: lv_valeur_2_0= ruleAtomic
            {

            					newCompositeNode(grammarAccess.getInstAccess().getValeurAtomicParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valeur_2_0=ruleAtomic();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstRule());
            					}
            					add(
            						current,
            						"valeur",
            						lv_valeur_2_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Atomic");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInst"


    // $ANTLR start "entryRuleTestIntention"
    // InternalTestintentionsAssistance.g:682:1: entryRuleTestIntention returns [EObject current=null] : iv_ruleTestIntention= ruleTestIntention EOF ;
    public final EObject entryRuleTestIntention() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestIntention = null;


        try {
            // InternalTestintentionsAssistance.g:682:54: (iv_ruleTestIntention= ruleTestIntention EOF )
            // InternalTestintentionsAssistance.g:683:2: iv_ruleTestIntention= ruleTestIntention EOF
            {
             newCompositeNode(grammarAccess.getTestIntentionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestIntention=ruleTestIntention();

            state._fsp--;

             current =iv_ruleTestIntention; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestIntention"


    // $ANTLR start "ruleTestIntention"
    // InternalTestintentionsAssistance.g:689:1: ruleTestIntention returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'datapredicate:' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'oracle:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) ) ;
    public final EObject ruleTestIntention() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_expression_3_0 = null;

        EObject lv_expression_7_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:695:2: ( (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'datapredicate:' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'oracle:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) ) )
            // InternalTestintentionsAssistance.g:696:2: (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'datapredicate:' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'oracle:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )
            {
            // InternalTestintentionsAssistance.g:696:2: (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'datapredicate:' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'oracle:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) ) )
            // InternalTestintentionsAssistance.g:697:3: otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'datapredicate:' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= 'oracle:' ( (otherlv_5= RULE_ID ) ) otherlv_6= '=' ( (lv_expression_7_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getTestIntentionAccess().getDescriptionKeyword_0());
            		
            // InternalTestintentionsAssistance.g:701:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalTestintentionsAssistance.g:702:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:702:4: (lv_description_1_0= RULE_STRING )
            // InternalTestintentionsAssistance.g:703:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_description_1_0, grammarAccess.getTestIntentionAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestIntentionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getTestIntentionAccess().getDatapredicateKeyword_2());
            		
            // InternalTestintentionsAssistance.g:723:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalTestintentionsAssistance.g:724:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalTestintentionsAssistance.g:724:4: (lv_expression_3_0= ruleExpression )
            // InternalTestintentionsAssistance.g:725:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestIntentionRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTestIntentionAccess().getOracleKeyword_4());
            		
            // InternalTestintentionsAssistance.g:746:3: ( (otherlv_5= RULE_ID ) )
            // InternalTestintentionsAssistance.g:747:4: (otherlv_5= RULE_ID )
            {
            // InternalTestintentionsAssistance.g:747:4: (otherlv_5= RULE_ID )
            // InternalTestintentionsAssistance.g:748:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestIntentionRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_5, grammarAccess.getTestIntentionAccess().getOutvarOutVariableCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getTestIntentionAccess().getEqualsSignKeyword_6());
            		
            // InternalTestintentionsAssistance.g:763:3: ( (lv_expression_7_0= ruleExpression ) )
            // InternalTestintentionsAssistance.g:764:4: (lv_expression_7_0= ruleExpression )
            {
            // InternalTestintentionsAssistance.g:764:4: (lv_expression_7_0= ruleExpression )
            // InternalTestintentionsAssistance.g:765:5: lv_expression_7_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_7_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestIntentionRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_7_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestIntention"


    // $ANTLR start "entryRuleExpression"
    // InternalTestintentionsAssistance.g:786:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTestintentionsAssistance.g:786:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalTestintentionsAssistance.g:787:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTestintentionsAssistance.g:793:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:799:2: (this_Or_0= ruleOr )
            // InternalTestintentionsAssistance.g:800:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalTestintentionsAssistance.g:811:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalTestintentionsAssistance.g:811:43: (iv_ruleOr= ruleOr EOF )
            // InternalTestintentionsAssistance.g:812:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTestintentionsAssistance.g:818:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:824:2: ( (this_And_0= ruleAnd ( () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalTestintentionsAssistance.g:825:2: (this_And_0= ruleAnd ( () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalTestintentionsAssistance.g:825:2: (this_And_0= ruleAnd ( () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalTestintentionsAssistance.g:826:3: this_And_0= ruleAnd ( () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:834:3: ( () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:835:4: () otherlv_2= '\\u2228' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalTestintentionsAssistance.g:835:4: ()
            	    // InternalTestintentionsAssistance.g:836:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getLogicalOrKeyword_1_1());
            	    			
            	    // InternalTestintentionsAssistance.g:846:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalTestintentionsAssistance.g:847:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalTestintentionsAssistance.g:847:5: (lv_right_3_0= ruleAnd )
            	    // InternalTestintentionsAssistance.g:848:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalTestintentionsAssistance.g:870:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalTestintentionsAssistance.g:870:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalTestintentionsAssistance.g:871:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTestintentionsAssistance.g:877:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:883:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalTestintentionsAssistance.g:884:2: (this_Equality_0= ruleEquality ( () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalTestintentionsAssistance.g:884:2: (this_Equality_0= ruleEquality ( () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalTestintentionsAssistance.g:885:3: this_Equality_0= ruleEquality ( () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:893:3: ( () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:894:4: () otherlv_2= '\\u2227' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalTestintentionsAssistance.g:894:4: ()
            	    // InternalTestintentionsAssistance.g:895:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,28,FOLLOW_21); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getLogicalAndKeyword_1_1());
            	    			
            	    // InternalTestintentionsAssistance.g:905:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalTestintentionsAssistance.g:906:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalTestintentionsAssistance.g:906:5: (lv_right_3_0= ruleEquality )
            	    // InternalTestintentionsAssistance.g:907:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalTestintentionsAssistance.g:929:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalTestintentionsAssistance.g:929:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalTestintentionsAssistance.g:930:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalTestintentionsAssistance.g:936:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:942:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalTestintentionsAssistance.g:943:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalTestintentionsAssistance.g:943:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalTestintentionsAssistance.g:944:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:952:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18||LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:953:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalTestintentionsAssistance.g:953:4: ()
            	    // InternalTestintentionsAssistance.g:954:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTestintentionsAssistance.g:960:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalTestintentionsAssistance.g:961:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalTestintentionsAssistance.g:961:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalTestintentionsAssistance.g:962:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalTestintentionsAssistance.g:962:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==18) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==29) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalTestintentionsAssistance.g:963:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,18,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTestintentionsAssistance.g:974:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTestintentionsAssistance.g:987:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalTestintentionsAssistance.g:988:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalTestintentionsAssistance.g:988:5: (lv_right_3_0= ruleComparison )
            	    // InternalTestintentionsAssistance.g:989:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalTestintentionsAssistance.g:1011:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalTestintentionsAssistance.g:1011:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalTestintentionsAssistance.g:1012:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalTestintentionsAssistance.g:1018:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1024:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalTestintentionsAssistance.g:1025:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalTestintentionsAssistance.g:1025:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalTestintentionsAssistance.g:1026:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:1034:3: ( () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=30 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1035:4: () ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalTestintentionsAssistance.g:1035:4: ()
            	    // InternalTestintentionsAssistance.g:1036:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTestintentionsAssistance.g:1042:4: ( ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalTestintentionsAssistance.g:1043:5: ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalTestintentionsAssistance.g:1043:5: ( (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalTestintentionsAssistance.g:1044:6: (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalTestintentionsAssistance.g:1044:6: (lv_op_2_1= '\\u2265' | lv_op_2_2= '\\u2264' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt15=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt15=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt15=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt15=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt15=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt15) {
            	        case 1 :
            	            // InternalTestintentionsAssistance.g:1045:7: lv_op_2_1= '\\u2265'
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTestintentionsAssistance.g:1056:7: lv_op_2_2= '\\u2264'
            	            {
            	            lv_op_2_2=(Token)match(input,31,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalTestintentionsAssistance.g:1067:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalTestintentionsAssistance.g:1078:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTestintentionsAssistance.g:1091:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalTestintentionsAssistance.g:1092:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalTestintentionsAssistance.g:1092:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalTestintentionsAssistance.g:1093:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalTestintentionsAssistance.g:1115:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalTestintentionsAssistance.g:1115:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalTestintentionsAssistance.g:1116:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalTestintentionsAssistance.g:1122:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1128:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalTestintentionsAssistance.g:1129:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalTestintentionsAssistance.g:1129:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalTestintentionsAssistance.g:1130:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:1138:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=34 && LA18_0<=35)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1139:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalTestintentionsAssistance.g:1139:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==34) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==35) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalTestintentionsAssistance.g:1140:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalTestintentionsAssistance.g:1140:5: ( () otherlv_2= '+' )
            	            // InternalTestintentionsAssistance.g:1141:6: () otherlv_2= '+'
            	            {
            	            // InternalTestintentionsAssistance.g:1141:6: ()
            	            // InternalTestintentionsAssistance.g:1142:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,34,FOLLOW_21); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalTestintentionsAssistance.g:1154:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalTestintentionsAssistance.g:1154:5: ( () otherlv_4= '-' )
            	            // InternalTestintentionsAssistance.g:1155:6: () otherlv_4= '-'
            	            {
            	            // InternalTestintentionsAssistance.g:1155:6: ()
            	            // InternalTestintentionsAssistance.g:1156:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,35,FOLLOW_21); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalTestintentionsAssistance.g:1168:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalTestintentionsAssistance.g:1169:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalTestintentionsAssistance.g:1169:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalTestintentionsAssistance.g:1170:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalTestintentionsAssistance.g:1192:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalTestintentionsAssistance.g:1192:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalTestintentionsAssistance.g:1193:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalTestintentionsAssistance.g:1199:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1205:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTestintentionsAssistance.g:1206:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTestintentionsAssistance.g:1206:2: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTestintentionsAssistance.g:1207:3: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalTestintentionsAssistance.g:1215:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=36 && LA20_0<=37)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1216:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTestintentionsAssistance.g:1216:4: ()
            	    // InternalTestintentionsAssistance.g:1217:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalTestintentionsAssistance.g:1223:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalTestintentionsAssistance.g:1224:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalTestintentionsAssistance.g:1224:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalTestintentionsAssistance.g:1225:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalTestintentionsAssistance.g:1225:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==36) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==37) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalTestintentionsAssistance.g:1226:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalTestintentionsAssistance.g:1237:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_21); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMulOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalTestintentionsAssistance.g:1250:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTestintentionsAssistance.g:1251:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTestintentionsAssistance.g:1251:5: (lv_right_3_0= rulePrimary )
            	    // InternalTestintentionsAssistance.g:1252:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleVariable"
    // InternalTestintentionsAssistance.g:1274:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTestintentionsAssistance.g:1274:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTestintentionsAssistance.g:1275:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTestintentionsAssistance.g:1281:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1287:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalTestintentionsAssistance.g:1288:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalTestintentionsAssistance.g:1288:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalTestintentionsAssistance.g:1289:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalTestintentionsAssistance.g:1289:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTestintentionsAssistance.g:1290:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTestintentionsAssistance.g:1290:4: (lv_name_0_0= RULE_ID )
            // InternalTestintentionsAssistance.g:1291:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalTestintentionsAssistance.g:1311:3: ( (lv_type_2_0= ruleType ) )
            // InternalTestintentionsAssistance.g:1312:4: (lv_type_2_0= ruleType )
            {
            // InternalTestintentionsAssistance.g:1312:4: (lv_type_2_0= ruleType )
            // InternalTestintentionsAssistance.g:1313:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBoolean"
    // InternalTestintentionsAssistance.g:1334:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalTestintentionsAssistance.g:1334:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalTestintentionsAssistance.g:1335:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalTestintentionsAssistance.g:1341:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1347:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalTestintentionsAssistance.g:1348:2: (kw= 'true' | kw= 'false' )
            {
            // InternalTestintentionsAssistance.g:1348:2: (kw= 'true' | kw= 'false' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1349:3: kw= 'true'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:1355:3: kw= 'false'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDouble"
    // InternalTestintentionsAssistance.g:1364:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalTestintentionsAssistance.g:1364:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalTestintentionsAssistance.g:1365:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalTestintentionsAssistance.g:1371:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1377:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalTestintentionsAssistance.g:1378:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalTestintentionsAssistance.g:1378:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalTestintentionsAssistance.g:1379:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,14,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRulePrimary"
    // InternalTestintentionsAssistance.g:1402:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTestintentionsAssistance.g:1402:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTestintentionsAssistance.g:1403:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTestintentionsAssistance.g:1409:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1415:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalTestintentionsAssistance.g:1416:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:1416:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt22=1;
                }
                break;
            case 40:
                {
                alt22=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 38:
            case 39:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1417:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalTestintentionsAssistance.g:1417:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalTestintentionsAssistance.g:1418:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:1436:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalTestintentionsAssistance.g:1436:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalTestintentionsAssistance.g:1437:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalTestintentionsAssistance.g:1437:4: ()
                    // InternalTestintentionsAssistance.g:1438:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,40,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalTestintentionsAssistance.g:1448:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalTestintentionsAssistance.g:1449:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalTestintentionsAssistance.g:1449:5: (lv_expression_5_0= rulePrimary )
                    // InternalTestintentionsAssistance.g:1450:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:1469:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalTestintentionsAssistance.g:1481:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalTestintentionsAssistance.g:1481:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalTestintentionsAssistance.g:1482:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalTestintentionsAssistance.g:1488:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1494:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) ) )
            // InternalTestintentionsAssistance.g:1495:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) )
            {
            // InternalTestintentionsAssistance.g:1495:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||LA23_1==RULE_ID||LA23_1==11||LA23_1==13||LA23_1==15||(LA23_1>=17 && LA23_1<=18)||(LA23_1>=20 && LA23_1<=21)||LA23_1==24||(LA23_1>=26 && LA23_1<=37)) ) {
                    alt23=1;
                }
                else if ( (LA23_1==14) ) {
                    alt23=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case 38:
            case 39:
                {
                alt23=3;
                }
                break;
            case RULE_ID:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1496:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalTestintentionsAssistance.g:1496:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalTestintentionsAssistance.g:1497:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalTestintentionsAssistance.g:1497:4: ()
                    // InternalTestintentionsAssistance.g:1498:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getINTAction_0_0(),
                    						current);
                    				

                    }

                    // InternalTestintentionsAssistance.g:1504:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalTestintentionsAssistance.g:1505:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalTestintentionsAssistance.g:1505:5: (lv_value_1_0= RULE_INT )
                    // InternalTestintentionsAssistance.g:1506:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:1524:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalTestintentionsAssistance.g:1524:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalTestintentionsAssistance.g:1525:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalTestintentionsAssistance.g:1525:4: ()
                    // InternalTestintentionsAssistance.g:1526:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getSTRINGAction_1_0(),
                    						current);
                    				

                    }

                    // InternalTestintentionsAssistance.g:1532:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalTestintentionsAssistance.g:1533:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalTestintentionsAssistance.g:1533:5: (lv_value_3_0= RULE_STRING )
                    // InternalTestintentionsAssistance.g:1534:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:1552:3: ( () ( (lv_value_5_0= ruleBoolean ) ) )
                    {
                    // InternalTestintentionsAssistance.g:1552:3: ( () ( (lv_value_5_0= ruleBoolean ) ) )
                    // InternalTestintentionsAssistance.g:1553:4: () ( (lv_value_5_0= ruleBoolean ) )
                    {
                    // InternalTestintentionsAssistance.g:1553:4: ()
                    // InternalTestintentionsAssistance.g:1554:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBooleanAction_2_0(),
                    						current);
                    				

                    }

                    // InternalTestintentionsAssistance.g:1560:4: ( (lv_value_5_0= ruleBoolean ) )
                    // InternalTestintentionsAssistance.g:1561:5: (lv_value_5_0= ruleBoolean )
                    {
                    // InternalTestintentionsAssistance.g:1561:5: (lv_value_5_0= ruleBoolean )
                    // InternalTestintentionsAssistance.g:1562:6: lv_value_5_0= ruleBoolean
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Boolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:1581:3: ( () ( (lv_value_7_0= ruleDouble ) ) )
                    {
                    // InternalTestintentionsAssistance.g:1581:3: ( () ( (lv_value_7_0= ruleDouble ) ) )
                    // InternalTestintentionsAssistance.g:1582:4: () ( (lv_value_7_0= ruleDouble ) )
                    {
                    // InternalTestintentionsAssistance.g:1582:4: ()
                    // InternalTestintentionsAssistance.g:1583:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getDoubleAction_3_0(),
                    						current);
                    				

                    }

                    // InternalTestintentionsAssistance.g:1589:4: ( (lv_value_7_0= ruleDouble ) )
                    // InternalTestintentionsAssistance.g:1590:5: (lv_value_7_0= ruleDouble )
                    {
                    // InternalTestintentionsAssistance.g:1590:5: (lv_value_7_0= ruleDouble )
                    // InternalTestintentionsAssistance.g:1591:6: lv_value_7_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"com.aelos.xtext.testintentionsassistance.TestintentionsAssistance.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTestintentionsAssistance.g:1610:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalTestintentionsAssistance.g:1610:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    // InternalTestintentionsAssistance.g:1611:4: () ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalTestintentionsAssistance.g:1611:4: ()
                    // InternalTestintentionsAssistance.g:1612:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableRefAction_4_0(),
                    						current);
                    				

                    }

                    // InternalTestintentionsAssistance.g:1618:4: ( (otherlv_9= RULE_ID ) )
                    // InternalTestintentionsAssistance.g:1619:5: (otherlv_9= RULE_ID )
                    {
                    // InternalTestintentionsAssistance.g:1619:5: (otherlv_9= RULE_ID )
                    // InternalTestintentionsAssistance.g:1620:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_9, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "ruleType"
    // InternalTestintentionsAssistance.g:1636:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalTestintentionsAssistance.g:1642:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalTestintentionsAssistance.g:1643:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalTestintentionsAssistance.g:1643:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt24=1;
                }
                break;
            case 42:
                {
                alt24=2;
                }
                break;
            case 43:
                {
                alt24=3;
                }
                break;
            case 44:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1644:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalTestintentionsAssistance.g:1644:3: (enumLiteral_0= 'INT' )
                    // InternalTestintentionsAssistance.g:1645:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:1652:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalTestintentionsAssistance.g:1652:3: (enumLiteral_1= 'STRING' )
                    // InternalTestintentionsAssistance.g:1653:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:1660:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalTestintentionsAssistance.g:1660:3: (enumLiteral_2= 'Boolean' )
                    // InternalTestintentionsAssistance.g:1661:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:1668:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalTestintentionsAssistance.g:1668:3: (enumLiteral_3= 'Double' )
                    // InternalTestintentionsAssistance.g:1669:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\26\3\uffff\1\51\4\21\1\uffff";
    static final String dfa_3s = "\1\30\1\uffff\1\26\3\uffff\1\54\4\27\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\5\uffff\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\6\uffff\1\5\3\uffff\1\4\5\uffff\1\3\2\uffff\1\1",
            "",
            "\1\6",
            "",
            "",
            "",
            "\1\7\1\10\1\11\1\12",
            "\2\13\4\uffff\1\3",
            "\2\13\4\uffff\1\3",
            "\2\13\4\uffff\1\3",
            "\2\13\4\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "302:2: (this_TestIntention_0= ruleTestIntention | this_Function_1= ruleFunction | this_Data_2= ruleData | this_Import_3= ruleImport | this_DomainDeclaration_4= ruleDomainDeclaration )";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\1\20\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\26\1\51\4\21\6\4\1\6\1\uffff\1\4";
    static final String dfa_10s = "\1\30\1\uffff\1\26\1\54\4\27\1\47\5\30\1\6\1\uffff\1\30";
    static final String dfa_11s = "\1\uffff\1\2\15\uffff\1\1\1\uffff";
    static final String dfa_12s = "\21\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\5\uffff\1\1\2\uffff\1\1",
            "",
            "\1\3",
            "\1\4\1\5\1\6\1\7",
            "\2\1\4\uffff\1\10",
            "\2\1\4\uffff\1\10",
            "\2\1\4\uffff\1\10",
            "\2\1\4\uffff\1\10",
            "\1\15\1\12\1\11\37\uffff\1\13\1\14",
            "\1\1\6\uffff\1\1\1\uffff\1\1\1\16\1\1\1\uffff\1\17\2\uffff\2\1\2\uffff\1\1",
            "\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\17\2\uffff\2\1\2\uffff\1\1",
            "\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\17\2\uffff\2\1\2\uffff\1\1",
            "\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\17\2\uffff\2\1\2\uffff\1\1",
            "\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\17\2\uffff\2\1\2\uffff\1\1",
            "\1\20",
            "",
            "\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\17\2\uffff\2\1\2\uffff\1\1"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 503:4: ( ( (lv_inst_2_0= ruleInst ) ) otherlv_3= ',' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000120A810L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00001E0000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000C000000070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000001C000080070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020040002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}