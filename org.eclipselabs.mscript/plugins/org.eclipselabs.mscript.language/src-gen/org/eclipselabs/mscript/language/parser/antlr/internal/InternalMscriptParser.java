package org.eclipselabs.mscript.language.parser.antlr.internal; 

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
import org.eclipselabs.mscript.language.services.MscriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMscriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_N", "RULE_ONE", "RULE_REAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'enum'", "'{'", "','", "'}'", "'type'", "'='", "';'", "'record'", "':'", "'stateful'", "'func'", "'<'", "'>'", "'('", "')'", "'->'", "'static'", "'assert'", "'var'", "'fob'", "'real'", "'int'", "'complex'", "'gauss'", "'bool'", "'string'", "'['", "']'", "'let'", "'in'", "'if'", "'then'", "'else'", "'switch'", "'default'", "'case'", "'=>'", "'||'", "'&&'", "'is'", "'.'", "'|'", "'true'", "'false'", "'..'", "'-'", "'for'", "'$'", "'begin'", "'end'", "'/'", "'*'", "'^'", "'::'", "'info'", "'warning'", "'error'", "'fatal'", "'=='", "'!='", "'<='", "'>='", "'+'", "'.*'", "'./'", "'.^'", "'!'", "'\\''"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_ONE=7;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_N=6;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int RULE_REAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalMscriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMscriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMscriptParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g"; }



     	private MscriptGrammarAccess grammarAccess;
     	
        public InternalMscriptParser(TokenStream input, MscriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Module";	
       	}
       	
       	@Override
       	protected MscriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModule"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:68:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:69:2: (iv_ruleModule= ruleModule EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:70:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:77:1: ruleModule returns [EObject current=null] : ( (lv_definitions_0_0= ruleDefinition ) )* ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:80:28: ( ( (lv_definitions_0_0= ruleDefinition ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:81:1: ( (lv_definitions_0_0= ruleDefinition ) )*
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:81:1: ( (lv_definitions_0_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==18||LA1_0==21||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:82:1: (lv_definitions_0_0= ruleDefinition )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:82:1: (lv_definitions_0_0= ruleDefinition )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:83:3: lv_definitions_0_0= ruleDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModuleAccess().getDefinitionsDefinitionParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDefinition_in_ruleModule130);
            	    lv_definitions_0_0=ruleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"definitions",
            	              		lv_definitions_0_0, 
            	              		"Definition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:107:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:108:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:109:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition166);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:116:1: ruleDefinition returns [EObject current=null] : (this_DataTypeDefinition_0= ruleDataTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeDefinition_0 = null;

        EObject this_FunctionDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:119:28: ( (this_DataTypeDefinition_0= ruleDataTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:120:1: (this_DataTypeDefinition_0= ruleDataTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:120:1: (this_DataTypeDefinition_0= ruleDataTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||LA2_0==18||LA2_0==21) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=23 && LA2_0<=24)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:121:5: this_DataTypeDefinition_0= ruleDataTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getDataTypeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataTypeDefinition_in_ruleDefinition223);
                    this_DataTypeDefinition_0=ruleDataTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataTypeDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:131:5: this_FunctionDefinition_1= ruleFunctionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDefinitionAccess().getFunctionDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleDefinition250);
                    this_FunctionDefinition_1=ruleFunctionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDataTypeDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:147:1: entryRuleDataTypeDefinition returns [EObject current=null] : iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF ;
    public final EObject entryRuleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeDefinition = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:148:2: (iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:149:2: iv_ruleDataTypeDefinition= ruleDataTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition285);
            iv_ruleDataTypeDefinition=ruleDataTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeDefinition295); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeDefinition"


    // $ANTLR start "ruleDataTypeDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:156:1: ruleDataTypeDefinition returns [EObject current=null] : (this_EnumerationDefinition_0= ruleEnumerationDefinition | this_RecordDefinition_1= ruleRecordDefinition | this_TypeAliasDefinition_2= ruleTypeAliasDefinition ) ;
    public final EObject ruleDataTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_EnumerationDefinition_0 = null;

        EObject this_RecordDefinition_1 = null;

        EObject this_TypeAliasDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:159:28: ( (this_EnumerationDefinition_0= ruleEnumerationDefinition | this_RecordDefinition_1= ruleRecordDefinition | this_TypeAliasDefinition_2= ruleTypeAliasDefinition ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:160:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition | this_RecordDefinition_1= ruleRecordDefinition | this_TypeAliasDefinition_2= ruleTypeAliasDefinition )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:160:1: (this_EnumerationDefinition_0= ruleEnumerationDefinition | this_RecordDefinition_1= ruleRecordDefinition | this_TypeAliasDefinition_2= ruleTypeAliasDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:161:5: this_EnumerationDefinition_0= ruleEnumerationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getEnumerationDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumerationDefinition_in_ruleDataTypeDefinition342);
                    this_EnumerationDefinition_0=ruleEnumerationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumerationDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:171:5: this_RecordDefinition_1= ruleRecordDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getRecordDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordDefinition_in_ruleDataTypeDefinition369);
                    this_RecordDefinition_1=ruleRecordDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:181:5: this_TypeAliasDefinition_2= ruleTypeAliasDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDataTypeDefinitionAccess().getTypeAliasDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeAliasDefinition_in_ruleDataTypeDefinition396);
                    this_TypeAliasDefinition_2=ruleTypeAliasDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeAliasDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataTypeDefinition"


    // $ANTLR start "entryRuleEnumerationDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:197:1: entryRuleEnumerationDefinition returns [EObject current=null] : iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF ;
    public final EObject entryRuleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDefinition = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:198:2: (iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:199:2: iv_ruleEnumerationDefinition= ruleEnumerationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition431);
            iv_ruleEnumerationDefinition=ruleEnumerationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationDefinition441); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationDefinition"


    // $ANTLR start "ruleEnumerationDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:206:1: ruleEnumerationDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnumerationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_literalDeclarations_3_0 = null;

        EObject lv_literalDeclarations_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:209:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )* )? otherlv_6= '}' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:210:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )* )? otherlv_6= '}' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:210:1: (otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )* )? otherlv_6= '}' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:210:3: otherlv_0= 'enum' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleEnumerationDefinition478); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationDefinitionAccess().getEnumKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:214:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:215:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:215:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:216:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleEnumerationDefinition499);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleEnumerationDefinition511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:236:1: ( ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_N) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:236:2: ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) ) (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )*
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:236:2: ( (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:237:1: (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:237:1: (lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:238:3: lv_literalDeclarations_3_0= ruleEnumerationLiteralDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getLiteralDeclarationsEnumerationLiteralDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnumerationLiteralDeclaration_in_ruleEnumerationDefinition533);
                    lv_literalDeclarations_3_0=ruleEnumerationLiteralDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumerationDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"literalDeclarations",
                              		lv_literalDeclarations_3_0, 
                              		"EnumerationLiteralDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:254:2: (otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:254:4: otherlv_4= ',' ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleEnumerationDefinition546); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getEnumerationDefinitionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:258:1: ( (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:259:1: (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:259:1: (lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:260:3: lv_literalDeclarations_5_0= ruleEnumerationLiteralDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEnumerationDefinitionAccess().getLiteralDeclarationsEnumerationLiteralDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleEnumerationLiteralDeclaration_in_ruleEnumerationDefinition567);
                    	    lv_literalDeclarations_5_0=ruleEnumerationLiteralDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getEnumerationDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"literalDeclarations",
                    	              		lv_literalDeclarations_5_0, 
                    	              		"EnumerationLiteralDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleEnumerationDefinition583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEnumerationDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumerationDefinition"


    // $ANTLR start "entryRuleEnumerationLiteralDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:288:1: entryRuleEnumerationLiteralDeclaration returns [EObject current=null] : iv_ruleEnumerationLiteralDeclaration= ruleEnumerationLiteralDeclaration EOF ;
    public final EObject entryRuleEnumerationLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralDeclaration = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:289:2: (iv_ruleEnumerationLiteralDeclaration= ruleEnumerationLiteralDeclaration EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:290:2: iv_ruleEnumerationLiteralDeclaration= ruleEnumerationLiteralDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationLiteralDeclaration_in_entryRuleEnumerationLiteralDeclaration619);
            iv_ruleEnumerationLiteralDeclaration=ruleEnumerationLiteralDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteralDeclaration629); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationLiteralDeclaration"


    // $ANTLR start "ruleEnumerationLiteralDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:297:1: ruleEnumerationLiteralDeclaration returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleEnumerationLiteralDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:300:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:301:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:301:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:302:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:302:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:303:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationLiteralDeclarationAccess().getNameValidIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleEnumerationLiteralDeclaration674);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationLiteralDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumerationLiteralDeclaration"


    // $ANTLR start "entryRuleTypeAliasDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:327:1: entryRuleTypeAliasDefinition returns [EObject current=null] : iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF ;
    public final EObject entryRuleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAliasDefinition = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:328:2: (iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:329:2: iv_ruleTypeAliasDefinition= ruleTypeAliasDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeAliasDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeAliasDefinition_in_entryRuleTypeAliasDefinition709);
            iv_ruleTypeAliasDefinition=ruleTypeAliasDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeAliasDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAliasDefinition719); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeAliasDefinition"


    // $ANTLR start "ruleTypeAliasDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:336:1: ruleTypeAliasDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' ( (lv_type_3_0= rulePrimitiveType ) ) otherlv_4= ';' ) ;
    public final EObject ruleTypeAliasDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:339:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' ( (lv_type_3_0= rulePrimitiveType ) ) otherlv_4= ';' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:340:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' ( (lv_type_3_0= rulePrimitiveType ) ) otherlv_4= ';' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:340:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' ( (lv_type_3_0= rulePrimitiveType ) ) otherlv_4= ';' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:340:3: otherlv_0= 'type' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '=' ( (lv_type_3_0= rulePrimitiveType ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTypeAliasDefinition756); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeAliasDefinitionAccess().getTypeKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:344:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:345:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:345:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:346:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleTypeAliasDefinition777);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeAliasDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTypeAliasDefinition789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeAliasDefinitionAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:366:1: ( (lv_type_3_0= rulePrimitiveType ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:367:1: (lv_type_3_0= rulePrimitiveType )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:367:1: (lv_type_3_0= rulePrimitiveType )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:368:3: lv_type_3_0= rulePrimitiveType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAliasDefinitionAccess().getTypePrimitiveTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_ruleTypeAliasDefinition810);
            lv_type_3_0=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeAliasDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"PrimitiveType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleTypeAliasDefinition822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeAliasDefinitionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeAliasDefinition"


    // $ANTLR start "entryRuleRecordDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:396:1: entryRuleRecordDefinition returns [EObject current=null] : iv_ruleRecordDefinition= ruleRecordDefinition EOF ;
    public final EObject entryRuleRecordDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordDefinition = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:397:2: (iv_ruleRecordDefinition= ruleRecordDefinition EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:398:2: iv_ruleRecordDefinition= ruleRecordDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRecordDefinition_in_entryRuleRecordDefinition858);
            iv_ruleRecordDefinition=ruleRecordDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordDefinition868); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordDefinition"


    // $ANTLR start "ruleRecordDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:405:1: ruleRecordDefinition returns [EObject current=null] : (otherlv_0= 'record' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleRecordDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_fieldDeclarations_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:408:28: ( (otherlv_0= 'record' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration ) )* otherlv_4= '}' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:409:1: (otherlv_0= 'record' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration ) )* otherlv_4= '}' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:409:1: (otherlv_0= 'record' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration ) )* otherlv_4= '}' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:409:3: otherlv_0= 'record' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= '{' ( (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRecordDefinition905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordDefinitionAccess().getRecordKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:413:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:414:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:414:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:415:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordDefinitionAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleRecordDefinition926);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRecordDefinition938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRecordDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:435:1: ( (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_N) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:436:1: (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:436:1: (lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:437:3: lv_fieldDeclarations_3_0= ruleRecordFieldDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordDefinitionAccess().getFieldDeclarationsRecordFieldDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRecordFieldDeclaration_in_ruleRecordDefinition959);
            	    lv_fieldDeclarations_3_0=ruleRecordFieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldDeclarations",
            	              		lv_fieldDeclarations_3_0, 
            	              		"RecordFieldDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRecordDefinition972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRecordDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordDefinition"


    // $ANTLR start "entryRuleRecordFieldDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:465:1: entryRuleRecordFieldDeclaration returns [EObject current=null] : iv_ruleRecordFieldDeclaration= ruleRecordFieldDeclaration EOF ;
    public final EObject entryRuleRecordFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordFieldDeclaration = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:466:2: (iv_ruleRecordFieldDeclaration= ruleRecordFieldDeclaration EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:467:2: iv_ruleRecordFieldDeclaration= ruleRecordFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordFieldDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleRecordFieldDeclaration_in_entryRuleRecordFieldDeclaration1008);
            iv_ruleRecordFieldDeclaration=ruleRecordFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordFieldDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordFieldDeclaration1018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecordFieldDeclaration"


    // $ANTLR start "ruleRecordFieldDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:474:1: ruleRecordFieldDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeSpecifier ) ) otherlv_3= ';' ) ;
    public final EObject ruleRecordFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:477:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeSpecifier ) ) otherlv_3= ';' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:478:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeSpecifier ) ) otherlv_3= ';' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:478:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeSpecifier ) ) otherlv_3= ';' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:478:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeSpecifier ) ) otherlv_3= ';'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:478:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:479:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:479:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:480:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordFieldDeclarationAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleRecordFieldDeclaration1064);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordFieldDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleRecordFieldDeclaration1076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordFieldDeclarationAccess().getColonKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:500:1: ( (lv_type_2_0= ruleDataTypeSpecifier ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:501:1: (lv_type_2_0= ruleDataTypeSpecifier )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:501:1: (lv_type_2_0= ruleDataTypeSpecifier )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:502:3: lv_type_2_0= ruleDataTypeSpecifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordFieldDeclarationAccess().getTypeDataTypeSpecifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDataTypeSpecifier_in_ruleRecordFieldDeclaration1097);
            lv_type_2_0=ruleDataTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordFieldDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"DataTypeSpecifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRecordFieldDeclaration1109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRecordFieldDeclarationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecordFieldDeclaration"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:530:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:531:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:532:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition1145);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition1155); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:539:1: ruleFunctionDefinition returns [EObject current=null] : ( ( (lv_stateful_0_0= 'stateful' ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )* )? otherlv_12= ')' otherlv_13= '->' ( (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration ) ) (otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) ) )* otherlv_17= '{' ( ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) ) | ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) ) | ( (lv_equations_21_0= ruleEquation ) ) )* otherlv_22= '}' ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_stateful_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_templateParameterDeclarations_4_0 = null;

        EObject lv_templateParameterDeclarations_6_0 = null;

        EObject lv_inputParameterDeclarations_9_0 = null;

        EObject lv_inputParameterDeclarations_11_0 = null;

        EObject lv_outputParameterDeclarations_14_0 = null;

        EObject lv_outputParameterDeclarations_16_0 = null;

        EObject lv_assertions_18_0 = null;

        EObject lv_functionObjectDeclarations_19_0 = null;

        EObject lv_stateVariableDeclarations_20_0 = null;

        EObject lv_equations_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:542:28: ( ( ( (lv_stateful_0_0= 'stateful' ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )* )? otherlv_12= ')' otherlv_13= '->' ( (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration ) ) (otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) ) )* otherlv_17= '{' ( ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) ) | ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) ) | ( (lv_equations_21_0= ruleEquation ) ) )* otherlv_22= '}' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:543:1: ( ( (lv_stateful_0_0= 'stateful' ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )* )? otherlv_12= ')' otherlv_13= '->' ( (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration ) ) (otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) ) )* otherlv_17= '{' ( ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) ) | ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) ) | ( (lv_equations_21_0= ruleEquation ) ) )* otherlv_22= '}' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:543:1: ( ( (lv_stateful_0_0= 'stateful' ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )* )? otherlv_12= ')' otherlv_13= '->' ( (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration ) ) (otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) ) )* otherlv_17= '{' ( ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) ) | ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) ) | ( (lv_equations_21_0= ruleEquation ) ) )* otherlv_22= '}' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:543:2: ( (lv_stateful_0_0= 'stateful' ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )* )? otherlv_12= ')' otherlv_13= '->' ( (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration ) ) (otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) ) )* otherlv_17= '{' ( ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) ) | ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) ) | ( (lv_equations_21_0= ruleEquation ) ) )* otherlv_22= '}'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:543:2: ( (lv_stateful_0_0= 'stateful' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:544:1: (lv_stateful_0_0= 'stateful' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:544:1: (lv_stateful_0_0= 'stateful' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:545:3: lv_stateful_0_0= 'stateful'
                    {
                    lv_stateful_0_0=(Token)match(input,23,FOLLOW_23_in_ruleFunctionDefinition1198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_stateful_0_0, grammarAccess.getFunctionDefinitionAccess().getStatefulStatefulKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "stateful", true, "stateful");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleFunctionDefinition1224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionDefinitionAccess().getFuncKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:562:1: ( (lv_name_2_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:563:1: (lv_name_2_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:563:1: (lv_name_2_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:564:3: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getNameValidIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFunctionDefinition1245);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:580:2: (otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:580:4: otherlv_3= '<' ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) ) (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleFunctionDefinition1258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:584:1: ( (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:585:1: (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:585:1: (lv_templateParameterDeclarations_4_0= ruleParameterDeclaration )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:586:3: lv_templateParameterDeclarations_4_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTemplateParameterDeclarationsParameterDeclarationParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1279);
                    lv_templateParameterDeclarations_4_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templateParameterDeclarations",
                              		lv_templateParameterDeclarations_4_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:602:2: (otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==16) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:602:4: otherlv_5= ',' ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition1292); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:606:1: ( (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:607:1: (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:607:1: (lv_templateParameterDeclarations_6_0= ruleParameterDeclaration )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:608:3: lv_templateParameterDeclarations_6_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTemplateParameterDeclarationsParameterDeclarationParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1313);
                    	    lv_templateParameterDeclarations_6_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templateParameterDeclarations",
                    	              		lv_templateParameterDeclarations_6_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleFunctionDefinition1327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleFunctionDefinition1341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:632:1: ( ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==RULE_N) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:632:2: ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) ) (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:632:2: ( (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:633:1: (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:633:1: (lv_inputParameterDeclarations_9_0= ruleParameterDeclaration )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:634:3: lv_inputParameterDeclarations_9_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getInputParameterDeclarationsParameterDeclarationParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1363);
                    lv_inputParameterDeclarations_9_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"inputParameterDeclarations",
                              		lv_inputParameterDeclarations_9_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:650:2: (otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:650:4: otherlv_10= ',' ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition1376); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_5_1_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:654:1: ( (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:655:1: (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:655:1: (lv_inputParameterDeclarations_11_0= ruleParameterDeclaration )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:656:3: lv_inputParameterDeclarations_11_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getInputParameterDeclarationsParameterDeclarationParserRuleCall_5_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1397);
                    	    lv_inputParameterDeclarations_11_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"inputParameterDeclarations",
                    	              		lv_inputParameterDeclarations_11_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleFunctionDefinition1413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_6());
                  
            }
            otherlv_13=(Token)match(input,29,FOLLOW_29_in_ruleFunctionDefinition1425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getFunctionDefinitionAccess().getHyphenMinusGreaterThanSignKeyword_7());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:680:1: ( (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:681:1: (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:681:1: (lv_outputParameterDeclarations_14_0= ruleParameterDeclaration )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:682:3: lv_outputParameterDeclarations_14_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOutputParameterDeclarationsParameterDeclarationParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1446);
            lv_outputParameterDeclarations_14_0=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"outputParameterDeclarations",
                      		lv_outputParameterDeclarations_14_0, 
                      		"ParameterDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:698:2: (otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:698:4: otherlv_15= ',' ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDefinition1459); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getFunctionDefinitionAccess().getCommaKeyword_9_0());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:702:1: ( (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:703:1: (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:703:1: (lv_outputParameterDeclarations_16_0= ruleParameterDeclaration )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:704:3: lv_outputParameterDeclarations_16_0= ruleParameterDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getOutputParameterDeclarationsParameterDeclarationParserRuleCall_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1480);
            	    lv_outputParameterDeclarations_16_0=ruleParameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outputParameterDeclarations",
            	              		lv_outputParameterDeclarations_16_0, 
            	              		"ParameterDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDefinition1494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getFunctionDefinitionAccess().getLeftCurlyBracketKeyword_10());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:724:1: ( ( (lv_assertions_18_0= ruleAssertion ) ) | ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) ) | ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) ) | ( (lv_equations_21_0= ruleEquation ) ) )*
            loop13:
            do {
                int alt13=5;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==44||LA13_2==47) ) {
                        alt13=4;
                    }
                    else if ( (LA13_2==31) ) {
                        alt13=1;
                    }


                    }
                    break;
                case 31:
                    {
                    alt13=1;
                    }
                    break;
                case 33:
                    {
                    alt13=2;
                    }
                    break;
                case 32:
                    {
                    alt13=3;
                    }
                    break;
                case RULE_ID:
                case RULE_STRING:
                case RULE_N:
                case RULE_ONE:
                case RULE_REAL:
                case RULE_INT:
                case 15:
                case 27:
                case 40:
                case 42:
                case 44:
                case 47:
                case 56:
                case 57:
                case 59:
                case 61:
                case 62:
                case 63:
                case 80:
                    {
                    alt13=4;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:724:2: ( (lv_assertions_18_0= ruleAssertion ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:724:2: ( (lv_assertions_18_0= ruleAssertion ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:725:1: (lv_assertions_18_0= ruleAssertion )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:725:1: (lv_assertions_18_0= ruleAssertion )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:726:3: lv_assertions_18_0= ruleAssertion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAssertionsAssertionParserRuleCall_11_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssertion_in_ruleFunctionDefinition1516);
            	    lv_assertions_18_0=ruleAssertion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assertions",
            	              		lv_assertions_18_0, 
            	              		"Assertion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:743:6: ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:743:6: ( (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:744:1: (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:744:1: (lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:745:3: lv_functionObjectDeclarations_19_0= ruleFunctionObjectDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFunctionObjectDeclarationsFunctionObjectDeclarationParserRuleCall_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionObjectDeclaration_in_ruleFunctionDefinition1543);
            	    lv_functionObjectDeclarations_19_0=ruleFunctionObjectDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionObjectDeclarations",
            	              		lv_functionObjectDeclarations_19_0, 
            	              		"FunctionObjectDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:762:6: ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:762:6: ( (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:763:1: (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:763:1: (lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:764:3: lv_stateVariableDeclarations_20_0= ruleStateVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getStateVariableDeclarationsStateVariableDeclarationParserRuleCall_11_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStateVariableDeclaration_in_ruleFunctionDefinition1570);
            	    lv_stateVariableDeclarations_20_0=ruleStateVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stateVariableDeclarations",
            	              		lv_stateVariableDeclarations_20_0, 
            	              		"StateVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:781:6: ( (lv_equations_21_0= ruleEquation ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:781:6: ( (lv_equations_21_0= ruleEquation ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:782:1: (lv_equations_21_0= ruleEquation )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:782:1: (lv_equations_21_0= ruleEquation )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:783:3: lv_equations_21_0= ruleEquation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getEquationsEquationParserRuleCall_11_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquation_in_ruleFunctionDefinition1597);
            	    lv_equations_21_0=ruleEquation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"equations",
            	              		lv_equations_21_0, 
            	              		"Equation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleFunctionDefinition1611); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getFunctionDefinitionAccess().getRightCurlyBracketKeyword_12());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:811:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:812:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:813:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1647);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1657); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:820:1: ruleParameterDeclaration returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:823:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:824:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:824:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:825:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:825:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:826:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getNameValidIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleParameterDeclaration1702);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleAssertion"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:850:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:851:2: (iv_ruleAssertion= ruleAssertion EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:852:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_ruleAssertion_in_entryRuleAssertion1737);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertion1747); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:859:1: ruleAssertion returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'assert' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statusKind_4_0= ruleAssertionStatusKind ) ) ( (lv_message_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;

        Enumerator lv_statusKind_4_0 = null;

        EObject lv_message_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:862:28: ( ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'assert' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statusKind_4_0= ruleAssertionStatusKind ) ) ( (lv_message_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:863:1: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'assert' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statusKind_4_0= ruleAssertionStatusKind ) ) ( (lv_message_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:863:1: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'assert' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statusKind_4_0= ruleAssertionStatusKind ) ) ( (lv_message_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:863:2: ( (lv_static_0_0= 'static' ) )? otherlv_1= 'assert' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_statusKind_4_0= ruleAssertionStatusKind ) ) ( (lv_message_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:863:2: ( (lv_static_0_0= 'static' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:864:1: (lv_static_0_0= 'static' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:864:1: (lv_static_0_0= 'static' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:865:3: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,30,FOLLOW_30_in_ruleAssertion1790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_0_0, grammarAccess.getAssertionAccess().getStaticStaticKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssertionRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAssertion1816); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getAssertKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:882:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:883:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:883:1: (lv_condition_2_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:884:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssertion1837);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAssertion1849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssertionAccess().getColonKeyword_3());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:904:1: ( (lv_statusKind_4_0= ruleAssertionStatusKind ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:905:1: (lv_statusKind_4_0= ruleAssertionStatusKind )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:905:1: (lv_statusKind_4_0= ruleAssertionStatusKind )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:906:3: lv_statusKind_4_0= ruleAssertionStatusKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getStatusKindAssertionStatusKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssertionStatusKind_in_ruleAssertion1870);
            lv_statusKind_4_0=ruleAssertionStatusKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionRule());
              	        }
                     		set(
                     			current, 
                     			"statusKind",
                      		lv_statusKind_4_0, 
                      		"AssertionStatusKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:922:2: ( (lv_message_5_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:923:1: (lv_message_5_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:923:1: (lv_message_5_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:924:3: lv_message_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssertionAccess().getMessageExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssertion1891);
            lv_message_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssertionRule());
              	        }
                     		set(
                     			current, 
                     			"message",
                      		lv_message_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleAssertion1903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAssertionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleStateVariableDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:952:1: entryRuleStateVariableDeclaration returns [EObject current=null] : iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF ;
    public final EObject entryRuleStateVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateVariableDeclaration = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:953:2: (iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:954:2: iv_ruleStateVariableDeclaration= ruleStateVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration1939);
            iv_ruleStateVariableDeclaration=ruleStateVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStateVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateVariableDeclaration1949); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStateVariableDeclaration"


    // $ANTLR start "ruleStateVariableDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:961:1: ruleStateVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ';' ) ;
    public final EObject ruleStateVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:964:28: ( (otherlv_0= 'var' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ';' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:965:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ';' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:965:1: (otherlv_0= 'var' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ';' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:965:3: otherlv_0= 'var' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleStateVariableDeclaration1986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStateVariableDeclarationAccess().getVarKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:969:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:970:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:970:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:971:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateVariableDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleStateVariableDeclaration2007);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleStateVariableDeclaration2019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStateVariableDeclarationAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStateVariableDeclaration"


    // $ANTLR start "entryRuleFunctionObjectDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:999:1: entryRuleFunctionObjectDeclaration returns [EObject current=null] : iv_ruleFunctionObjectDeclaration= ruleFunctionObjectDeclaration EOF ;
    public final EObject entryRuleFunctionObjectDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionObjectDeclaration = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1000:2: (iv_ruleFunctionObjectDeclaration= ruleFunctionObjectDeclaration EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1001:2: iv_ruleFunctionObjectDeclaration= ruleFunctionObjectDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionObjectDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionObjectDeclaration_in_entryRuleFunctionObjectDeclaration2055);
            iv_ruleFunctionObjectDeclaration=ruleFunctionObjectDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionObjectDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionObjectDeclaration2065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionObjectDeclaration"


    // $ANTLR start "ruleFunctionObjectDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1008:1: ruleFunctionObjectDeclaration returns [EObject current=null] : (otherlv_0= 'fob' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>' )? otherlv_9= ';' ) ;
    public final EObject ruleFunctionObjectDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_templateArguments_5_0 = null;

        EObject lv_templateArguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1011:28: ( (otherlv_0= 'fob' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>' )? otherlv_9= ';' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1012:1: (otherlv_0= 'fob' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>' )? otherlv_9= ';' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1012:1: (otherlv_0= 'fob' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>' )? otherlv_9= ';' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1012:3: otherlv_0= 'fob' ( (lv_name_1_0= ruleValidID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>' )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFunctionObjectDeclaration2102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionObjectDeclarationAccess().getFobKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1016:1: ( (lv_name_1_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1017:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1017:1: (lv_name_1_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1018:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionObjectDeclarationAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFunctionObjectDeclaration2123);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionObjectDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleFunctionObjectDeclaration2135); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionObjectDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1038:1: ( ( ruleQualifiedName ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1039:1: ( ruleQualifiedName )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1039:1: ( ruleQualifiedName )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1040:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionObjectDeclarationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionObjectDeclarationAccess().getFunctionNameFunctionDefinitionCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleFunctionObjectDeclaration2158);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1053:2: (otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1053:4: otherlv_4= '<' ( (lv_templateArguments_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )* otherlv_8= '>'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleFunctionObjectDeclaration2171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFunctionObjectDeclarationAccess().getLessThanSignKeyword_4_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1057:1: ( (lv_templateArguments_5_0= ruleExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1058:1: (lv_templateArguments_5_0= ruleExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1058:1: (lv_templateArguments_5_0= ruleExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1059:3: lv_templateArguments_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionObjectDeclarationAccess().getTemplateArgumentsExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionObjectDeclaration2192);
                    lv_templateArguments_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionObjectDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"templateArguments",
                              		lv_templateArguments_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1075:2: (otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==16) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1075:4: otherlv_6= ',' ( (lv_templateArguments_7_0= ruleExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFunctionObjectDeclaration2205); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getFunctionObjectDeclarationAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1079:1: ( (lv_templateArguments_7_0= ruleExpression ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1080:1: (lv_templateArguments_7_0= ruleExpression )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1080:1: (lv_templateArguments_7_0= ruleExpression )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1081:3: lv_templateArguments_7_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionObjectDeclarationAccess().getTemplateArgumentsExpressionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionObjectDeclaration2226);
                    	    lv_templateArguments_7_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionObjectDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templateArguments",
                    	              		lv_templateArguments_7_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleFunctionObjectDeclaration2240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionObjectDeclarationAccess().getGreaterThanSignKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleFunctionObjectDeclaration2254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionObjectDeclarationAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctionObjectDeclaration"


    // $ANTLR start "entryRuleEquation"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1113:1: entryRuleEquation returns [EObject current=null] : iv_ruleEquation= ruleEquation EOF ;
    public final EObject entryRuleEquation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquation = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1114:2: (iv_ruleEquation= ruleEquation EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1115:2: iv_ruleEquation= ruleEquation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquationRule()); 
            }
            pushFollow(FOLLOW_ruleEquation_in_entryRuleEquation2290);
            iv_ruleEquation=ruleEquation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquation2300); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquation"


    // $ANTLR start "ruleEquation"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1122:1: ruleEquation returns [EObject current=null] : ( ( (lv_leftHandSide_0_0= ruleExpression ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleEquation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_leftHandSide_0_0 = null;

        EObject lv_rightHandSide_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1125:28: ( ( ( (lv_leftHandSide_0_0= ruleExpression ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1126:1: ( ( (lv_leftHandSide_0_0= ruleExpression ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1126:1: ( ( (lv_leftHandSide_0_0= ruleExpression ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) otherlv_3= ';' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1126:2: ( (lv_leftHandSide_0_0= ruleExpression ) ) otherlv_1= '=' ( (lv_rightHandSide_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1126:2: ( (lv_leftHandSide_0_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1127:1: (lv_leftHandSide_0_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1127:1: (lv_leftHandSide_0_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1128:3: lv_leftHandSide_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getLeftHandSideExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleEquation2346);
            lv_leftHandSide_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEquationRule());
              	        }
                     		set(
                     			current, 
                     			"leftHandSide",
                      		lv_leftHandSide_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEquation2358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEquationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1148:1: ( (lv_rightHandSide_2_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1149:1: (lv_rightHandSide_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1149:1: (lv_rightHandSide_2_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1150:3: lv_rightHandSide_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEquationAccess().getRightHandSideExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleEquation2379);
            lv_rightHandSide_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEquationRule());
              	        }
                     		set(
                     			current, 
                     			"rightHandSide",
                      		lv_rightHandSide_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEquation2391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEquationAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEquation"


    // $ANTLR start "entryRuleDataTypeSpecifier"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1178:1: entryRuleDataTypeSpecifier returns [EObject current=null] : iv_ruleDataTypeSpecifier= ruleDataTypeSpecifier EOF ;
    public final EObject entryRuleDataTypeSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeSpecifier = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1179:2: (iv_ruleDataTypeSpecifier= ruleDataTypeSpecifier EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1180:2: iv_ruleDataTypeSpecifier= ruleDataTypeSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleDataTypeSpecifier_in_entryRuleDataTypeSpecifier2427);
            iv_ruleDataTypeSpecifier=ruleDataTypeSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeSpecifier2437); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataTypeSpecifier"


    // $ANTLR start "ruleDataTypeSpecifier"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1187:1: ruleDataTypeSpecifier returns [EObject current=null] : ( ( ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDataTypeSpecifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_definedType_0_1 = null;

        EObject lv_definedType_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1190:28: ( ( ( ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1191:1: ( ( ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1191:1: ( ( ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=34 && LA18_0<=39)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||(LA18_2>=16 && LA18_2<=17)||(LA18_2>=19 && LA18_2<=20)||LA18_2==22||LA18_2==26||LA18_2==28||LA18_2==41||LA18_2==43||(LA18_2>=45 && LA18_2<=46)||(LA18_2>=48 && LA18_2<=52)||LA18_2==55||LA18_2==60||(LA18_2>=72 && LA18_2<=73)) ) {
                    alt18=2;
                }
                else if ( (LA18_2==40) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1191:2: ( ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1191:2: ( ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1192:1: ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1192:1: ( (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1193:1: (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1193:1: (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType )
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1194:3: lv_definedType_0_1= rulePrimitiveType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeSpecifierAccess().getDefinedTypePrimitiveTypeParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePrimitiveType_in_ruleDataTypeSpecifier2485);
                            lv_definedType_0_1=rulePrimitiveType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeSpecifierRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definedType",
                                      		lv_definedType_0_1, 
                                      		"PrimitiveType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1209:8: lv_definedType_0_2= ruleArrayType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDataTypeSpecifierAccess().getDefinedTypeArrayTypeParserRuleCall_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArrayType_in_ruleDataTypeSpecifier2504);
                            lv_definedType_0_2=ruleArrayType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDataTypeSpecifierRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definedType",
                                      		lv_definedType_0_2, 
                                      		"ArrayType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1228:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1228:6: ( (otherlv_1= RULE_ID ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1229:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1229:1: (otherlv_1= RULE_ID )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1230:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDataTypeSpecifierRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataTypeSpecifier2533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getDataTypeSpecifierAccess().getTypeDataTypeCrossReference_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataTypeSpecifier"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1249:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1250:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1251:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType2569);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType2579); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1258:1: rulePrimitiveType returns [EObject current=null] : (this_NumericType_0= ruleNumericType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject this_NumericType_0 = null;

        EObject this_BooleanType_1 = null;

        EObject this_StringType_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1261:28: ( (this_NumericType_0= ruleNumericType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1262:1: (this_NumericType_0= ruleNumericType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1262:1: (this_NumericType_0= ruleNumericType | this_BooleanType_1= ruleBooleanType | this_StringType_2= ruleStringType )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 39:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1263:5: this_NumericType_0= ruleNumericType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNumericTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericType_in_rulePrimitiveType2626);
                    this_NumericType_0=ruleNumericType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumericType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1273:5: this_BooleanType_1= ruleBooleanType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getBooleanTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanType_in_rulePrimitiveType2653);
                    this_BooleanType_1=ruleBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1283:5: this_StringType_2= ruleStringType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getStringTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringType_in_rulePrimitiveType2680);
                    this_StringType_2=ruleStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleNumericType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1299:1: entryRuleNumericType returns [EObject current=null] : iv_ruleNumericType= ruleNumericType EOF ;
    public final EObject entryRuleNumericType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1300:2: (iv_ruleNumericType= ruleNumericType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1301:2: iv_ruleNumericType= ruleNumericType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNumericType_in_entryRuleNumericType2715);
            iv_ruleNumericType=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericType2725); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericType"


    // $ANTLR start "ruleNumericType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1308:1: ruleNumericType returns [EObject current=null] : (this_RealType_0= ruleRealType | this_IntegerType_1= ruleIntegerType | this_ComplexType_2= ruleComplexType | this_GaussianType_3= ruleGaussianType ) ;
    public final EObject ruleNumericType() throws RecognitionException {
        EObject current = null;

        EObject this_RealType_0 = null;

        EObject this_IntegerType_1 = null;

        EObject this_ComplexType_2 = null;

        EObject this_GaussianType_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1311:28: ( (this_RealType_0= ruleRealType | this_IntegerType_1= ruleIntegerType | this_ComplexType_2= ruleComplexType | this_GaussianType_3= ruleGaussianType ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1312:1: (this_RealType_0= ruleRealType | this_IntegerType_1= ruleIntegerType | this_ComplexType_2= ruleComplexType | this_GaussianType_3= ruleGaussianType )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1312:1: (this_RealType_0= ruleRealType | this_IntegerType_1= ruleIntegerType | this_ComplexType_2= ruleComplexType | this_GaussianType_3= ruleGaussianType )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            case 37:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1313:5: this_RealType_0= ruleRealType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getRealTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealType_in_ruleNumericType2772);
                    this_RealType_0=ruleRealType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1323:5: this_IntegerType_1= ruleIntegerType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getIntegerTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerType_in_ruleNumericType2799);
                    this_IntegerType_1=ruleIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerType_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1333:5: this_ComplexType_2= ruleComplexType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getComplexTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComplexType_in_ruleNumericType2826);
                    this_ComplexType_2=ruleComplexType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComplexType_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1343:5: this_GaussianType_3= ruleGaussianType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericTypeAccess().getGaussianTypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGaussianType_in_ruleNumericType2853);
                    this_GaussianType_3=ruleGaussianType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GaussianType_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumericType"


    // $ANTLR start "entryRuleRealType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1359:1: entryRuleRealType returns [EObject current=null] : iv_ruleRealType= ruleRealType EOF ;
    public final EObject entryRuleRealType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1360:2: (iv_ruleRealType= ruleRealType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1361:2: iv_ruleRealType= ruleRealType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeRule()); 
            }
            pushFollow(FOLLOW_ruleRealType_in_entryRuleRealType2888);
            iv_ruleRealType=ruleRealType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealType2898); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealType"


    // $ANTLR start "ruleRealType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1368:1: ruleRealType returns [EObject current=null] : ( () otherlv_1= 'real' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleRealType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1371:28: ( ( () otherlv_1= 'real' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1372:1: ( () otherlv_1= 'real' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1372:1: ( () otherlv_1= 'real' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1372:2: () otherlv_1= 'real' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1372:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1373:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealTypeAccess().getRealTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleRealType2944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealTypeAccess().getRealKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1382:1: (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1382:3: otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleRealType2957); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRealTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1386:1: ( (lv_unit_3_0= ruleUnit ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1387:1: (lv_unit_3_0= ruleUnit )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1387:1: (lv_unit_3_0= ruleUnit )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1388:3: lv_unit_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealTypeAccess().getUnitUnitParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleRealType2978);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleRealType2990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRealTypeAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealType"


    // $ANTLR start "entryRuleIntegerType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1416:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1417:2: (iv_ruleIntegerType= ruleIntegerType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1418:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerType_in_entryRuleIntegerType3028);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerType3038); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1425:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'int' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1428:28: ( ( () otherlv_1= 'int' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1429:1: ( () otherlv_1= 'int' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1429:1: ( () otherlv_1= 'int' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1429:2: () otherlv_1= 'int' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1429:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1430:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleIntegerType3084); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1439:1: (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1439:3: otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleIntegerType3097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIntegerTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1443:1: ( (lv_unit_3_0= ruleUnit ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1444:1: (lv_unit_3_0= ruleUnit )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1444:1: (lv_unit_3_0= ruleUnit )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1445:3: lv_unit_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerTypeAccess().getUnitUnitParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleIntegerType3118);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleIntegerType3130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIntegerTypeAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleComplexType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1473:1: entryRuleComplexType returns [EObject current=null] : iv_ruleComplexType= ruleComplexType EOF ;
    public final EObject entryRuleComplexType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1474:2: (iv_ruleComplexType= ruleComplexType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1475:2: iv_ruleComplexType= ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_ruleComplexType_in_entryRuleComplexType3168);
            iv_ruleComplexType=ruleComplexType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComplexType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexType3178); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1482:1: ruleComplexType returns [EObject current=null] : ( () otherlv_1= 'complex' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleComplexType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1485:28: ( ( () otherlv_1= 'complex' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1486:1: ( () otherlv_1= 'complex' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1486:1: ( () otherlv_1= 'complex' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1486:2: () otherlv_1= 'complex' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1486:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1487:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getComplexTypeAccess().getComplexTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleComplexType3224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getComplexTypeAccess().getComplexKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1496:1: (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1496:3: otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleComplexType3237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getComplexTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1500:1: ( (lv_unit_3_0= ruleUnit ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1501:1: (lv_unit_3_0= ruleUnit )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1501:1: (lv_unit_3_0= ruleUnit )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1502:3: lv_unit_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getComplexTypeAccess().getUnitUnitParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleComplexType3258);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getComplexTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleComplexType3270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getComplexTypeAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleGaussianType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1530:1: entryRuleGaussianType returns [EObject current=null] : iv_ruleGaussianType= ruleGaussianType EOF ;
    public final EObject entryRuleGaussianType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGaussianType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1531:2: (iv_ruleGaussianType= ruleGaussianType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1532:2: iv_ruleGaussianType= ruleGaussianType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGaussianTypeRule()); 
            }
            pushFollow(FOLLOW_ruleGaussianType_in_entryRuleGaussianType3308);
            iv_ruleGaussianType=ruleGaussianType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGaussianType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGaussianType3318); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGaussianType"


    // $ANTLR start "ruleGaussianType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1539:1: ruleGaussianType returns [EObject current=null] : ( () otherlv_1= 'gauss' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleGaussianType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1542:28: ( ( () otherlv_1= 'gauss' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1543:1: ( () otherlv_1= 'gauss' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1543:1: ( () otherlv_1= 'gauss' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1543:2: () otherlv_1= 'gauss' (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1543:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1544:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGaussianTypeAccess().getGaussianTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleGaussianType3364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGaussianTypeAccess().getGaussKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1553:1: (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1553:3: otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleGaussianType3377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getGaussianTypeAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1557:1: ( (lv_unit_3_0= ruleUnit ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1558:1: (lv_unit_3_0= ruleUnit )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1558:1: (lv_unit_3_0= ruleUnit )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1559:3: lv_unit_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGaussianTypeAccess().getUnitUnitParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleGaussianType3398);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGaussianTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleGaussianType3410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getGaussianTypeAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGaussianType"


    // $ANTLR start "entryRuleBooleanType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1587:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1588:2: (iv_ruleBooleanType= ruleBooleanType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1589:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanType_in_entryRuleBooleanType3448);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanType3458); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1596:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1599:28: ( ( () otherlv_1= 'bool' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1600:1: ( () otherlv_1= 'bool' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1600:1: ( () otherlv_1= 'bool' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1600:2: () otherlv_1= 'bool'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1600:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1601:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleBooleanType3504); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBoolKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleStringType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1618:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1619:2: (iv_ruleStringType= ruleStringType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1620:2: iv_ruleStringType= ruleStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringTypeRule()); 
            }
            pushFollow(FOLLOW_ruleStringType_in_entryRuleStringType3540);
            iv_ruleStringType=ruleStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringType3550); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1627:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1630:28: ( ( () otherlv_1= 'string' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1631:1: ( () otherlv_1= 'string' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1631:1: ( () otherlv_1= 'string' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1631:2: () otherlv_1= 'string'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1631:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1632:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleStringType3596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleArrayType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1649:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1650:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1651:2: iv_ruleArrayType= ruleArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRule()); 
            }
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType3632);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType3642); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1658:1: ruleArrayType returns [EObject current=null] : (this_TensorType_0= ruleTensorType | ( ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']' ) ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_TensorType_0 = null;

        EObject lv_definedElementType_1_0 = null;

        EObject lv_dimensions_4_0 = null;

        EObject lv_dimensions_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1661:28: ( (this_TensorType_0= ruleTensorType | ( ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1662:1: (this_TensorType_0= ruleTensorType | ( ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1662:1: (this_TensorType_0= ruleTensorType | ( ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                int LA27_1 = input.LA(2);

                if ( (true) ) {
                    alt27=1;
                }
                else if ( (synpred1_InternalMscript()) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==35) ) {
                int LA27_2 = input.LA(2);

                if ( (true) ) {
                    alt27=1;
                }
                else if ( (synpred1_InternalMscript()) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==36) ) {
                int LA27_3 = input.LA(2);

                if ( (true) ) {
                    alt27=1;
                }
                else if ( (synpred1_InternalMscript()) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==37) ) {
                int LA27_4 = input.LA(2);

                if ( (true) ) {
                    alt27=1;
                }
                else if ( (synpred1_InternalMscript()) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==38) && (synpred1_InternalMscript())) {
                alt27=2;
            }
            else if ( (LA27_0==39) && (synpred1_InternalMscript())) {
                alt27=2;
            }
            else if ( (LA27_0==RULE_ID) && (synpred1_InternalMscript())) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1663:5: this_TensorType_0= ruleTensorType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArrayTypeAccess().getTensorTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTensorType_in_ruleArrayType3689);
                    this_TensorType_0=ruleTensorType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TensorType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:6: ( ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:6: ( ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:7: ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) ) otherlv_3= '[' ( (lv_dimensions_4_0= ruleArrayDimension ) ) (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )* otherlv_7= ']'
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:7: ( ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:8: ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )=> ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1682:6: ( ( (lv_definedElementType_1_0= rulePrimitiveType ) ) | ( (otherlv_2= RULE_ID ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=34 && LA25_0<=39)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==RULE_ID) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1682:7: ( (lv_definedElementType_1_0= rulePrimitiveType ) )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1682:7: ( (lv_definedElementType_1_0= rulePrimitiveType ) )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1683:1: (lv_definedElementType_1_0= rulePrimitiveType )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1683:1: (lv_definedElementType_1_0= rulePrimitiveType )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1684:3: lv_definedElementType_1_0= rulePrimitiveType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getArrayTypeAccess().getDefinedElementTypePrimitiveTypeParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_rulePrimitiveType_in_ruleArrayType3749);
                            lv_definedElementType_1_0=rulePrimitiveType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"definedElementType",
                                      		lv_definedElementType_1_0, 
                                      		"PrimitiveType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1701:6: ( (otherlv_2= RULE_ID ) )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1701:6: ( (otherlv_2= RULE_ID ) )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1702:1: (otherlv_2= RULE_ID )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1702:1: (otherlv_2= RULE_ID )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1703:3: otherlv_2= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getArrayTypeRule());
                              	        }
                                      
                            }
                            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArrayType3775); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_2, grammarAccess.getArrayTypeAccess().getElementTypeDataTypeCrossReference_1_0_0_1_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;

                    }


                    }

                    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleArrayType3789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1_1());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1718:1: ( (lv_dimensions_4_0= ruleArrayDimension ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1719:1: (lv_dimensions_4_0= ruleArrayDimension )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1719:1: (lv_dimensions_4_0= ruleArrayDimension )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1720:3: lv_dimensions_4_0= ruleArrayDimension
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayTypeAccess().getDimensionsArrayDimensionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrayDimension_in_ruleArrayType3810);
                    lv_dimensions_4_0=ruleArrayDimension();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"dimensions",
                              		lv_dimensions_4_0, 
                              		"ArrayDimension");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1736:2: (otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1736:4: otherlv_5= ',' ( (lv_dimensions_6_0= ruleArrayDimension ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleArrayType3823); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getArrayTypeAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1740:1: ( (lv_dimensions_6_0= ruleArrayDimension ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1741:1: (lv_dimensions_6_0= ruleArrayDimension )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1741:1: (lv_dimensions_6_0= ruleArrayDimension )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1742:3: lv_dimensions_6_0= ruleArrayDimension
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayTypeAccess().getDimensionsArrayDimensionParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayDimension_in_ruleArrayType3844);
                    	    lv_dimensions_6_0=ruleArrayDimension();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"dimensions",
                    	              		lv_dimensions_6_0, 
                    	              		"ArrayDimension");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleArrayType3858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_1_4());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleTensorType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1770:1: entryRuleTensorType returns [EObject current=null] : iv_ruleTensorType= ruleTensorType EOF ;
    public final EObject entryRuleTensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTensorType = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1771:2: (iv_ruleTensorType= ruleTensorType EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1772:2: iv_ruleTensorType= ruleTensorType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTensorTypeRule()); 
            }
            pushFollow(FOLLOW_ruleTensorType_in_entryRuleTensorType3895);
            iv_ruleTensorType=ruleTensorType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTensorType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTensorType3905); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTensorType"


    // $ANTLR start "ruleTensorType"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1779:1: ruleTensorType returns [EObject current=null] : ( ( (lv_definedElementType_0_0= ruleNumericType ) ) otherlv_1= '[' ( (lv_dimensions_2_0= ruleArrayDimension ) ) (otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleTensorType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_definedElementType_0_0 = null;

        EObject lv_dimensions_2_0 = null;

        EObject lv_dimensions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1782:28: ( ( ( (lv_definedElementType_0_0= ruleNumericType ) ) otherlv_1= '[' ( (lv_dimensions_2_0= ruleArrayDimension ) ) (otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) ) )* otherlv_5= ']' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1783:1: ( ( (lv_definedElementType_0_0= ruleNumericType ) ) otherlv_1= '[' ( (lv_dimensions_2_0= ruleArrayDimension ) ) (otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) ) )* otherlv_5= ']' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1783:1: ( ( (lv_definedElementType_0_0= ruleNumericType ) ) otherlv_1= '[' ( (lv_dimensions_2_0= ruleArrayDimension ) ) (otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) ) )* otherlv_5= ']' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1783:2: ( (lv_definedElementType_0_0= ruleNumericType ) ) otherlv_1= '[' ( (lv_dimensions_2_0= ruleArrayDimension ) ) (otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) ) )* otherlv_5= ']'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1783:2: ( (lv_definedElementType_0_0= ruleNumericType ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1784:1: (lv_definedElementType_0_0= ruleNumericType )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1784:1: (lv_definedElementType_0_0= ruleNumericType )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1785:3: lv_definedElementType_0_0= ruleNumericType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTensorTypeAccess().getDefinedElementTypeNumericTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumericType_in_ruleTensorType3951);
            lv_definedElementType_0_0=ruleNumericType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTensorTypeRule());
              	        }
                     		set(
                     			current, 
                     			"definedElementType",
                      		lv_definedElementType_0_0, 
                      		"NumericType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleTensorType3963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTensorTypeAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1805:1: ( (lv_dimensions_2_0= ruleArrayDimension ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1806:1: (lv_dimensions_2_0= ruleArrayDimension )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1806:1: (lv_dimensions_2_0= ruleArrayDimension )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1807:3: lv_dimensions_2_0= ruleArrayDimension
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTensorTypeAccess().getDimensionsArrayDimensionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArrayDimension_in_ruleTensorType3984);
            lv_dimensions_2_0=ruleArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTensorTypeRule());
              	        }
                     		add(
                     			current, 
                     			"dimensions",
                      		lv_dimensions_2_0, 
                      		"ArrayDimension");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1823:2: (otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1823:4: otherlv_3= ',' ( (lv_dimensions_4_0= ruleArrayDimension ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTensorType3997); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTensorTypeAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1827:1: ( (lv_dimensions_4_0= ruleArrayDimension ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1828:1: (lv_dimensions_4_0= ruleArrayDimension )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1828:1: (lv_dimensions_4_0= ruleArrayDimension )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1829:3: lv_dimensions_4_0= ruleArrayDimension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTensorTypeAccess().getDimensionsArrayDimensionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArrayDimension_in_ruleTensorType4018);
            	    lv_dimensions_4_0=ruleArrayDimension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTensorTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dimensions",
            	              		lv_dimensions_4_0, 
            	              		"ArrayDimension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleTensorType4032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTensorTypeAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTensorType"


    // $ANTLR start "entryRuleArrayDimension"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1857:1: entryRuleArrayDimension returns [EObject current=null] : iv_ruleArrayDimension= ruleArrayDimension EOF ;
    public final EObject entryRuleArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayDimension = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1858:2: (iv_ruleArrayDimension= ruleArrayDimension EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1859:2: iv_ruleArrayDimension= ruleArrayDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayDimensionRule()); 
            }
            pushFollow(FOLLOW_ruleArrayDimension_in_entryRuleArrayDimension4068);
            iv_ruleArrayDimension=ruleArrayDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayDimension; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayDimension4078); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayDimension"


    // $ANTLR start "ruleArrayDimension"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1866:1: ruleArrayDimension returns [EObject current=null] : ( () ( (lv_size_1_0= ruleExpression ) )? ) ;
    public final EObject ruleArrayDimension() throws RecognitionException {
        EObject current = null;

        EObject lv_size_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1869:28: ( ( () ( (lv_size_1_0= ruleExpression ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1870:1: ( () ( (lv_size_1_0= ruleExpression ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1870:1: ( () ( (lv_size_1_0= ruleExpression ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1870:2: () ( (lv_size_1_0= ruleExpression ) )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1870:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1871:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayDimensionAccess().getArrayDimensionAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1876:2: ( (lv_size_1_0= ruleExpression ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==15||LA29_0==27||LA29_0==30||LA29_0==40||LA29_0==42||LA29_0==44||LA29_0==47||(LA29_0>=56 && LA29_0<=57)||LA29_0==59||(LA29_0>=61 && LA29_0<=63)||LA29_0==80) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1877:1: (lv_size_1_0= ruleExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1877:1: (lv_size_1_0= ruleExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1878:3: lv_size_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayDimensionAccess().getSizeExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayDimension4133);
                    lv_size_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayDimensionRule());
                      	        }
                             		set(
                             			current, 
                             			"size",
                              		lv_size_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayDimension"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1902:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1903:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1904:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4170);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4180); if (state.failed) return current;

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
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1911:1: ruleExpression returns [EObject current=null] : (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_SwitchExpression_2= ruleSwitchExpression | this_RangeExpression_3= ruleRangeExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LetExpression_0 = null;

        EObject this_IfExpression_1 = null;

        EObject this_SwitchExpression_2 = null;

        EObject this_RangeExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1914:28: ( (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_SwitchExpression_2= ruleSwitchExpression | this_RangeExpression_3= ruleRangeExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1915:1: (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_SwitchExpression_2= ruleSwitchExpression | this_RangeExpression_3= ruleRangeExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1915:1: (this_LetExpression_0= ruleLetExpression | this_IfExpression_1= ruleIfExpression | this_SwitchExpression_2= ruleSwitchExpression | this_RangeExpression_3= ruleRangeExpression )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt30=1;
                }
                break;
            case 30:
                {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==47) ) {
                    alt30=3;
                }
                else if ( (LA30_2==44) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt30=2;
                }
                break;
            case 47:
                {
                alt30=3;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_N:
            case RULE_ONE:
            case RULE_REAL:
            case RULE_INT:
            case 15:
            case 27:
            case 40:
            case 56:
            case 57:
            case 59:
            case 61:
            case 62:
            case 63:
            case 80:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1916:5: this_LetExpression_0= ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getLetExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetExpression_in_ruleExpression4227);
                    this_LetExpression_0=ruleLetExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1926:5: this_IfExpression_1= ruleIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getIfExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExpression_in_ruleExpression4254);
                    this_IfExpression_1=ruleIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1936:5: this_SwitchExpression_2= ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchExpression_in_ruleExpression4281);
                    this_SwitchExpression_2=ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1946:5: this_RangeExpression_3= ruleRangeExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getRangeExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRangeExpression_in_ruleExpression4308);
                    this_RangeExpression_3=ruleRangeExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RangeExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLetExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1962:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1963:2: (iv_ruleLetExpression= ruleLetExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1964:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression4343);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression4353); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1971:1: ruleLetExpression returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_targetExpression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variableDeclarations_1_0 = null;

        EObject lv_variableDeclarations_3_0 = null;

        EObject lv_targetExpression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1974:28: ( (otherlv_0= 'let' ( (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_targetExpression_5_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1975:1: (otherlv_0= 'let' ( (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_targetExpression_5_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1975:1: (otherlv_0= 'let' ( (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_targetExpression_5_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1975:3: otherlv_0= 'let' ( (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration ) ) (otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) ) )* otherlv_4= 'in' ( (lv_targetExpression_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleLetExpression4390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLetExpressionAccess().getLetKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1979:1: ( (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1980:1: (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1980:1: (lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1981:3: lv_variableDeclarations_1_0= ruleLetExpressionVariableDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getVariableDeclarationsLetExpressionVariableDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLetExpressionVariableDeclaration_in_ruleLetExpression4411);
            lv_variableDeclarations_1_0=ruleLetExpressionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"variableDeclarations",
                      		lv_variableDeclarations_1_0, 
                      		"LetExpressionVariableDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1997:2: (otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==16) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1997:4: otherlv_2= ',' ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleLetExpression4424); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2001:1: ( (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2002:1: (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2002:1: (lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2003:3: lv_variableDeclarations_3_0= ruleLetExpressionVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpressionAccess().getVariableDeclarationsLetExpressionVariableDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLetExpressionVariableDeclaration_in_ruleLetExpression4445);
            	    lv_variableDeclarations_3_0=ruleLetExpressionVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variableDeclarations",
            	              		lv_variableDeclarations_3_0, 
            	              		"LetExpressionVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleLetExpression4459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getInKeyword_3());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2023:1: ( (lv_targetExpression_5_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2024:1: (lv_targetExpression_5_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2024:1: (lv_targetExpression_5_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2025:3: lv_targetExpression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getTargetExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetExpression4480);
            lv_targetExpression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"targetExpression",
                      		lv_targetExpression_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleLetExpressionVariableDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2049:1: entryRuleLetExpressionVariableDeclaration returns [EObject current=null] : iv_ruleLetExpressionVariableDeclaration= ruleLetExpressionVariableDeclaration EOF ;
    public final EObject entryRuleLetExpressionVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpressionVariableDeclaration = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2050:2: (iv_ruleLetExpressionVariableDeclaration= ruleLetExpressionVariableDeclaration EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2051:2: iv_ruleLetExpressionVariableDeclaration= ruleLetExpressionVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpressionVariableDeclaration_in_entryRuleLetExpressionVariableDeclaration4516);
            iv_ruleLetExpressionVariableDeclaration=ruleLetExpressionVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpressionVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpressionVariableDeclaration4526); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpressionVariableDeclaration"


    // $ANTLR start "ruleLetExpressionVariableDeclaration"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2058:1: ruleLetExpressionVariableDeclaration returns [EObject current=null] : ( ( ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) ) | (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' ) ) otherlv_6= '=' ( (lv_assignedExpression_7_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExpressionVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parts_0_0 = null;

        EObject lv_parts_2_0 = null;

        EObject lv_parts_4_0 = null;

        EObject lv_assignedExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2061:28: ( ( ( ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) ) | (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' ) ) otherlv_6= '=' ( (lv_assignedExpression_7_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2062:1: ( ( ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) ) | (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' ) ) otherlv_6= '=' ( (lv_assignedExpression_7_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2062:1: ( ( ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) ) | (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' ) ) otherlv_6= '=' ( (lv_assignedExpression_7_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2062:2: ( ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) ) | (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' ) ) otherlv_6= '=' ( (lv_assignedExpression_7_0= ruleExpression ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2062:2: ( ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) ) | (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==RULE_N) ) {
                alt33=1;
            }
            else if ( (LA33_0==27) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2062:3: ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2062:3: ( (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2063:1: (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2063:1: (lv_parts_0_0= ruleLetExpressionVariableDeclarationPart )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2064:3: lv_parts_0_0= ruleLetExpressionVariableDeclarationPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationAccess().getPartsLetExpressionVariableDeclarationPartParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLetExpressionVariableDeclarationPart_in_ruleLetExpressionVariableDeclaration4573);
                    lv_parts_0_0=ruleLetExpressionVariableDeclarationPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetExpressionVariableDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parts",
                              		lv_parts_0_0, 
                              		"LetExpressionVariableDeclarationPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2081:6: (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2081:6: (otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2081:8: otherlv_1= '(' ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+ otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleLetExpressionVariableDeclaration4592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLetExpressionVariableDeclarationAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2085:1: ( (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2086:1: (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2086:1: (lv_parts_2_0= ruleLetExpressionVariableDeclarationPart )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2087:3: lv_parts_2_0= ruleLetExpressionVariableDeclarationPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationAccess().getPartsLetExpressionVariableDeclarationPartParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLetExpressionVariableDeclarationPart_in_ruleLetExpressionVariableDeclaration4613);
                    lv_parts_2_0=ruleLetExpressionVariableDeclarationPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLetExpressionVariableDeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"parts",
                              		lv_parts_2_0, 
                              		"LetExpressionVariableDeclarationPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2103:2: (otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2103:4: otherlv_3= ',' ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleLetExpressionVariableDeclaration4626); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getLetExpressionVariableDeclarationAccess().getCommaKeyword_0_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2107:1: ( (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2108:1: (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2108:1: (lv_parts_4_0= ruleLetExpressionVariableDeclarationPart )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2109:3: lv_parts_4_0= ruleLetExpressionVariableDeclarationPart
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationAccess().getPartsLetExpressionVariableDeclarationPartParserRuleCall_0_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLetExpressionVariableDeclarationPart_in_ruleLetExpressionVariableDeclaration4647);
                    	    lv_parts_4_0=ruleLetExpressionVariableDeclarationPart();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLetExpressionVariableDeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parts",
                    	              		lv_parts_4_0, 
                    	              		"LetExpressionVariableDeclarationPart");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleLetExpressionVariableDeclaration4661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLetExpressionVariableDeclarationAccess().getRightParenthesisKeyword_0_1_3());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleLetExpressionVariableDeclaration4675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLetExpressionVariableDeclarationAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2133:1: ( (lv_assignedExpression_7_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2134:1: (lv_assignedExpression_7_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2134:1: (lv_assignedExpression_7_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2135:3: lv_assignedExpression_7_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationAccess().getAssignedExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetExpressionVariableDeclaration4696);
            lv_assignedExpression_7_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"assignedExpression",
                      		lv_assignedExpression_7_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetExpressionVariableDeclaration"


    // $ANTLR start "entryRuleLetExpressionVariableDeclarationPart"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2159:1: entryRuleLetExpressionVariableDeclarationPart returns [EObject current=null] : iv_ruleLetExpressionVariableDeclarationPart= ruleLetExpressionVariableDeclarationPart EOF ;
    public final EObject entryRuleLetExpressionVariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpressionVariableDeclarationPart = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2160:2: (iv_ruleLetExpressionVariableDeclarationPart= ruleLetExpressionVariableDeclarationPart EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2161:2: iv_ruleLetExpressionVariableDeclarationPart= ruleLetExpressionVariableDeclarationPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationPartRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpressionVariableDeclarationPart_in_entryRuleLetExpressionVariableDeclarationPart4732);
            iv_ruleLetExpressionVariableDeclarationPart=ruleLetExpressionVariableDeclarationPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpressionVariableDeclarationPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpressionVariableDeclarationPart4742); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpressionVariableDeclarationPart"


    // $ANTLR start "ruleLetExpressionVariableDeclarationPart"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2168:1: ruleLetExpressionVariableDeclarationPart returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleLetExpressionVariableDeclarationPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2171:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2172:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2172:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2173:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2173:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2174:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionVariableDeclarationPartAccess().getNameValidIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleLetExpressionVariableDeclarationPart4787);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionVariableDeclarationPartRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLetExpressionVariableDeclarationPart"


    // $ANTLR start "entryRuleIfExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2198:1: entryRuleIfExpression returns [EObject current=null] : iv_ruleIfExpression= ruleIfExpression EOF ;
    public final EObject entryRuleIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2199:2: (iv_ruleIfExpression= ruleIfExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2200:2: iv_ruleIfExpression= ruleIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIfExpression_in_entryRuleIfExpression4822);
            iv_ruleIfExpression=ruleIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpression4832); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpression"


    // $ANTLR start "ruleIfExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2207:1: ruleIfExpression returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleIfExpression() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenExpression_4_0 = null;

        EObject lv_elseExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2210:28: ( ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2211:1: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2211:1: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2211:2: ( (lv_static_0_0= 'static' ) )? otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_thenExpression_4_0= ruleExpression ) ) otherlv_5= 'else' ( (lv_elseExpression_6_0= ruleExpression ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2211:2: ( (lv_static_0_0= 'static' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2212:1: (lv_static_0_0= 'static' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2212:1: (lv_static_0_0= 'static' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2213:3: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,30,FOLLOW_30_in_ruleIfExpression4875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_0_0, grammarAccess.getIfExpressionAccess().getStaticStaticKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleIfExpression4901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfExpressionAccess().getIfKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2230:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2231:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2231:1: (lv_condition_2_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2232:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression4922);
            lv_condition_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleIfExpression4934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfExpressionAccess().getThenKeyword_3());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2252:1: ( (lv_thenExpression_4_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2253:1: (lv_thenExpression_4_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2253:1: (lv_thenExpression_4_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2254:3: lv_thenExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getThenExpressionExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression4955);
            lv_thenExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"thenExpression",
                      		lv_thenExpression_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleIfExpression4967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIfExpressionAccess().getElseKeyword_5());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2274:1: ( (lv_elseExpression_6_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2275:1: (lv_elseExpression_6_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2275:1: (lv_elseExpression_6_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2276:3: lv_elseExpression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpressionAccess().getElseExpressionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfExpression4988);
            lv_elseExpression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"elseExpression",
                      		lv_elseExpression_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfExpression"


    // $ANTLR start "entryRuleSwitchExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2300:1: entryRuleSwitchExpression returns [EObject current=null] : iv_ruleSwitchExpression= ruleSwitchExpression EOF ;
    public final EObject entryRuleSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2301:2: (iv_ruleSwitchExpression= ruleSwitchExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2302:2: iv_ruleSwitchExpression= ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression5024);
            iv_ruleSwitchExpression=ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchExpression5034); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchExpression"


    // $ANTLR start "ruleSwitchExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2309:1: ruleSwitchExpression returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'switch' ( (lv_controlExpression_2_0= ruleExpression ) ) ( (lv_cases_3_0= ruleSwitchCase ) )* otherlv_4= 'default' otherlv_5= ':' ( (lv_defaultExpression_6_0= ruleExpression ) ) ) ;
    public final EObject ruleSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_controlExpression_2_0 = null;

        EObject lv_cases_3_0 = null;

        EObject lv_defaultExpression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2312:28: ( ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'switch' ( (lv_controlExpression_2_0= ruleExpression ) ) ( (lv_cases_3_0= ruleSwitchCase ) )* otherlv_4= 'default' otherlv_5= ':' ( (lv_defaultExpression_6_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2313:1: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'switch' ( (lv_controlExpression_2_0= ruleExpression ) ) ( (lv_cases_3_0= ruleSwitchCase ) )* otherlv_4= 'default' otherlv_5= ':' ( (lv_defaultExpression_6_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2313:1: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'switch' ( (lv_controlExpression_2_0= ruleExpression ) ) ( (lv_cases_3_0= ruleSwitchCase ) )* otherlv_4= 'default' otherlv_5= ':' ( (lv_defaultExpression_6_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2313:2: ( (lv_static_0_0= 'static' ) )? otherlv_1= 'switch' ( (lv_controlExpression_2_0= ruleExpression ) ) ( (lv_cases_3_0= ruleSwitchCase ) )* otherlv_4= 'default' otherlv_5= ':' ( (lv_defaultExpression_6_0= ruleExpression ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2313:2: ( (lv_static_0_0= 'static' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2314:1: (lv_static_0_0= 'static' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2314:1: (lv_static_0_0= 'static' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2315:3: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,30,FOLLOW_30_in_ruleSwitchExpression5077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_0_0, grammarAccess.getSwitchExpressionAccess().getStaticStaticKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSwitchExpressionRule());
                      	        }
                             		setWithLastConsumed(current, "static", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleSwitchExpression5103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2332:1: ( (lv_controlExpression_2_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2333:1: (lv_controlExpression_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2333:1: (lv_controlExpression_2_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2334:3: lv_controlExpression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getControlExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression5124);
            lv_controlExpression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"controlExpression",
                      		lv_controlExpression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2350:2: ( (lv_cases_3_0= ruleSwitchCase ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==49) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2351:1: (lv_cases_3_0= ruleSwitchCase )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2351:1: (lv_cases_3_0= ruleSwitchCase )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2352:3: lv_cases_3_0= ruleSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getCasesSwitchCaseParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitchExpression5145);
            	    lv_cases_3_0=ruleSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_3_0, 
            	              		"SwitchCase");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleSwitchExpression5158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchExpressionAccess().getDefaultKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSwitchExpression5170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSwitchExpressionAccess().getColonKeyword_5());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2376:1: ( (lv_defaultExpression_6_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2377:1: (lv_defaultExpression_6_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2377:1: (lv_defaultExpression_6_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2378:3: lv_defaultExpression_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression5191);
            lv_defaultExpression_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"defaultExpression",
                      		lv_defaultExpression_6_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchExpression"


    // $ANTLR start "entryRuleSwitchCase"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2402:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2403:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2404:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5227);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase5237); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2411:1: ruleSwitchCase returns [EObject current=null] : (otherlv_0= 'case' ( (lv_caseExpression_1_0= ruleImpliesExpression ) ) otherlv_2= ':' ( (lv_resultExpression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_caseExpression_1_0 = null;

        EObject lv_resultExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2414:28: ( (otherlv_0= 'case' ( (lv_caseExpression_1_0= ruleImpliesExpression ) ) otherlv_2= ':' ( (lv_resultExpression_3_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2415:1: (otherlv_0= 'case' ( (lv_caseExpression_1_0= ruleImpliesExpression ) ) otherlv_2= ':' ( (lv_resultExpression_3_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2415:1: (otherlv_0= 'case' ( (lv_caseExpression_1_0= ruleImpliesExpression ) ) otherlv_2= ':' ( (lv_resultExpression_3_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2415:3: otherlv_0= 'case' ( (lv_caseExpression_1_0= ruleImpliesExpression ) ) otherlv_2= ':' ( (lv_resultExpression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleSwitchCase5274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchCaseAccess().getCaseKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2419:1: ( (lv_caseExpression_1_0= ruleImpliesExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2420:1: (lv_caseExpression_1_0= ruleImpliesExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2420:1: (lv_caseExpression_1_0= ruleImpliesExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2421:3: lv_caseExpression_1_0= ruleImpliesExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getCaseExpressionImpliesExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpliesExpression_in_ruleSwitchCase5295);
            lv_caseExpression_1_0=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              	        }
                     		set(
                     			current, 
                     			"caseExpression",
                      		lv_caseExpression_1_0, 
                      		"ImpliesExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleSwitchCase5307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getColonKeyword_2());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2441:1: ( (lv_resultExpression_3_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2442:1: (lv_resultExpression_3_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2442:1: (lv_resultExpression_3_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2443:3: lv_resultExpression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getResultExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchCase5328);
            lv_resultExpression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
              	        }
                     		set(
                     			current, 
                     			"resultExpression",
                      		lv_resultExpression_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleRangeExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2467:1: entryRuleRangeExpression returns [EObject current=null] : iv_ruleRangeExpression= ruleRangeExpression EOF ;
    public final EObject entryRuleRangeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2468:2: (iv_ruleRangeExpression= ruleRangeExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2469:2: iv_ruleRangeExpression= ruleRangeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRangeExpression_in_entryRuleRangeExpression5364);
            iv_ruleRangeExpression=ruleRangeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeExpression5374); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRangeExpression"


    // $ANTLR start "ruleRangeExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2476:1: ruleRangeExpression returns [EObject current=null] : (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )? )? ) ;
    public final EObject ruleRangeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ImpliesExpression_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_operands_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2479:28: ( (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )? )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2480:1: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )? )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2480:1: (this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )? )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2481:5: this_ImpliesExpression_0= ruleImpliesExpression ( () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )? )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRangeExpressionAccess().getImpliesExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImpliesExpression_in_ruleRangeExpression5421);
            this_ImpliesExpression_0=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2489:1: ( () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )? )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==22) ) {
                int LA38_1 = input.LA(2);

                if ( ((LA38_1>=RULE_ID && LA38_1<=RULE_INT)||LA38_1==15||LA38_1==27||LA38_1==40||(LA38_1>=56 && LA38_1<=57)||LA38_1==59||(LA38_1>=61 && LA38_1<=63)||LA38_1==80) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2489:2: () otherlv_2= ':' ( (lv_operands_3_0= ruleImpliesExpression ) ) (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )?
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2489:2: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2490:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getRangeExpressionAccess().getRangeExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleRangeExpression5442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRangeExpressionAccess().getColonKeyword_1_1());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2499:1: ( (lv_operands_3_0= ruleImpliesExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2500:1: (lv_operands_3_0= ruleImpliesExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2500:1: (lv_operands_3_0= ruleImpliesExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2501:3: lv_operands_3_0= ruleImpliesExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRangeExpressionAccess().getOperandsImpliesExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImpliesExpression_in_ruleRangeExpression5463);
                    lv_operands_3_0=ruleImpliesExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"operands",
                              		lv_operands_3_0, 
                              		"ImpliesExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2517:2: (otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==22) ) {
                        int LA37_1 = input.LA(2);

                        if ( ((LA37_1>=RULE_ID && LA37_1<=RULE_INT)||LA37_1==15||LA37_1==27||LA37_1==40||(LA37_1>=56 && LA37_1<=57)||LA37_1==59||(LA37_1>=61 && LA37_1<=63)||LA37_1==80) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2517:4: otherlv_4= ':' ( (lv_operands_5_0= ruleImpliesExpression ) )
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleRangeExpression5476); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getRangeExpressionAccess().getColonKeyword_1_3_0());
                                  
                            }
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2521:1: ( (lv_operands_5_0= ruleImpliesExpression ) )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2522:1: (lv_operands_5_0= ruleImpliesExpression )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2522:1: (lv_operands_5_0= ruleImpliesExpression )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2523:3: lv_operands_5_0= ruleImpliesExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRangeExpressionAccess().getOperandsImpliesExpressionParserRuleCall_1_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleImpliesExpression_in_ruleRangeExpression5497);
                            lv_operands_5_0=ruleImpliesExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRangeExpressionRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"operands",
                                      		lv_operands_5_0, 
                                      		"ImpliesExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRangeExpression"


    // $ANTLR start "entryRuleImpliesExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2547:1: entryRuleImpliesExpression returns [EObject current=null] : iv_ruleImpliesExpression= ruleImpliesExpression EOF ;
    public final EObject entryRuleImpliesExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2548:2: (iv_ruleImpliesExpression= ruleImpliesExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2549:2: iv_ruleImpliesExpression= ruleImpliesExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression5537);
            iv_ruleImpliesExpression=ruleImpliesExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpression5547); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImpliesExpression"


    // $ANTLR start "ruleImpliesExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2556:1: ruleImpliesExpression returns [EObject current=null] : (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleImpliesExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalOrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2559:28: ( (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2560:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2560:1: (this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2561:5: this_LogicalOrExpression_0= ruleLogicalOrExpression ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExpressionAccess().getLogicalOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleImpliesExpression5594);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2569:1: ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2569:2: () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2569:2: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2570:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExpressionAccess().getImpliesExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleImpliesExpression5615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImpliesExpressionAccess().getEqualsSignGreaterThanSignKeyword_1_1());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2579:1: ( (lv_rightOperand_3_0= ruleLogicalOrExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2580:1: (lv_rightOperand_3_0= ruleLogicalOrExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2580:1: (lv_rightOperand_3_0= ruleLogicalOrExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2581:3: lv_rightOperand_3_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExpressionAccess().getRightOperandLogicalOrExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLogicalOrExpression_in_ruleImpliesExpression5636);
                    lv_rightOperand_3_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImpliesExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_3_0, 
                              		"LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImpliesExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2605:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2606:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2607:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5674);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOrExpression5684); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2614:1: ruleLogicalOrExpression returns [EObject current=null] : (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2617:28: ( (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2618:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2618:1: (this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2619:5: this_LogicalAndExpression_0= ruleLogicalAndExpression ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5731);
            this_LogicalAndExpression_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2627:1: ( () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==51) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2627:2: () otherlv_2= '||' ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2627:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2628:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrExpressionAccess().getLogicalOrExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleLogicalOrExpression5752); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2637:1: ( (lv_rightOperand_3_0= ruleLogicalAndExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2638:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2638:1: (lv_rightOperand_3_0= ruleLogicalAndExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2639:3: lv_rightOperand_3_0= ruleLogicalAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightOperandLogicalAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5773);
            	    lv_rightOperand_3_0=ruleLogicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"LogicalAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2663:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2664:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2665:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5811);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAndExpression5821); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2672:1: ruleLogicalAndExpression returns [EObject current=null] : (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2675:28: ( (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2676:1: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2676:1: (this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2677:5: this_EqualityExpression_0= ruleEqualityExpression ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleLogicalAndExpression5868);
            this_EqualityExpression_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2685:1: ( () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2685:2: () otherlv_2= '&&' ( (lv_rightOperand_3_0= ruleEqualityExpression ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2685:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2686:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndExpressionAccess().getLogicalAndExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleLogicalAndExpression5889); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2695:1: ( (lv_rightOperand_3_0= ruleEqualityExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2696:1: (lv_rightOperand_3_0= ruleEqualityExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2696:1: (lv_rightOperand_3_0= ruleEqualityExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2697:3: lv_rightOperand_3_0= ruleEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightOperandEqualityExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleLogicalAndExpression5910);
            	    lv_rightOperand_3_0=ruleEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"EqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2721:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2722:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2723:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression5948);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression5958); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2730:1: ruleEqualityExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RelationalExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2733:28: ( (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2734:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2734:1: (this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2735:5: this_RelationalExpression_0= ruleRelationalExpression ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression6005);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2743:1: ( () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=72 && LA42_0<=73)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2743:2: () ( (lv_operator_2_0= ruleEqualityOperator ) ) ( (lv_rightOperand_3_0= ruleRelationalExpression ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2743:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2744:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2749:2: ( (lv_operator_2_0= ruleEqualityOperator ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2750:1: (lv_operator_2_0= ruleEqualityOperator )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2750:1: (lv_operator_2_0= ruleEqualityOperator )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2751:3: lv_operator_2_0= ruleEqualityOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getOperatorEqualityOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEqualityOperator_in_ruleEqualityExpression6035);
            	    lv_operator_2_0=ruleEqualityOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"EqualityOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2767:2: ( (lv_rightOperand_3_0= ruleRelationalExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2768:1: (lv_rightOperand_3_0= ruleRelationalExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2768:1: (lv_rightOperand_3_0= ruleRelationalExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2769:3: lv_rightOperand_3_0= ruleRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightOperandRelationalExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression6056);
            	    lv_rightOperand_3_0=ruleRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"RelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2793:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2794:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2795:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression6094);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression6104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2802:1: ruleRelationalExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) ) | ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_AdditiveExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;

        EObject lv_type_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2805:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) ) | ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2806:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) ) | ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2806:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) ) | ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2807:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) ) | ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression6151);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2815:1: ( ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) ) | ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) ) )?
            int alt43=3;
            switch ( input.LA(1) ) {
                case 25:
                case 74:
                case 75:
                    {
                    alt43=1;
                    }
                    break;
                case 26:
                    {
                    int LA43_2 = input.LA(2);

                    if ( ((LA43_2>=RULE_ID && LA43_2<=RULE_INT)||LA43_2==15||LA43_2==27||LA43_2==40||(LA43_2>=56 && LA43_2<=57)||LA43_2==59||(LA43_2>=61 && LA43_2<=63)||LA43_2==80) ) {
                        alt43=1;
                    }
                    }
                    break;
                case 53:
                    {
                    alt43=2;
                    }
                    break;
            }

            switch (alt43) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2815:2: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2815:2: ( () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2815:3: () ( (lv_operator_2_0= ruleRelationalOperator ) ) ( (lv_rightOperand_3_0= ruleAdditiveExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2815:3: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2816:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2821:2: ( (lv_operator_2_0= ruleRelationalOperator ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2822:1: (lv_operator_2_0= ruleRelationalOperator )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2822:1: (lv_operator_2_0= ruleRelationalOperator )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2823:3: lv_operator_2_0= ruleRelationalOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorRelationalOperatorEnumRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRelationalOperator_in_ruleRelationalExpression6182);
                    lv_operator_2_0=ruleRelationalOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"RelationalOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2839:2: ( (lv_rightOperand_3_0= ruleAdditiveExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2840:1: (lv_rightOperand_3_0= ruleAdditiveExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2840:1: (lv_rightOperand_3_0= ruleAdditiveExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2841:3: lv_rightOperand_3_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression6203);
                    lv_rightOperand_3_0=ruleAdditiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_3_0, 
                              		"AdditiveExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2858:6: ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2858:6: ( () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2858:7: () otherlv_5= 'is' ( (lv_type_6_0= ruleDataTypeSpecifier ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2858:7: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2859:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRelationalExpressionAccess().getTypeTestExpressionExpressionAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,53,FOLLOW_53_in_ruleRelationalExpression6232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRelationalExpressionAccess().getIsKeyword_1_1_1());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2868:1: ( (lv_type_6_0= ruleDataTypeSpecifier ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2869:1: (lv_type_6_0= ruleDataTypeSpecifier )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2869:1: (lv_type_6_0= ruleDataTypeSpecifier )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2870:3: lv_type_6_0= ruleDataTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getTypeDataTypeSpecifierParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDataTypeSpecifier_in_ruleRelationalExpression6253);
                    lv_type_6_0=ruleDataTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_6_0, 
                              		"DataTypeSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2894:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2895:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2896:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6292);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression6302); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2903:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2906:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2907:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2907:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2908:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6349);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2916:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==59||LA44_0==76) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2916:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2916:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2917:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2922:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2923:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2923:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2924:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleAdditiveExpression6379);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2940:2: ( (lv_rightOperand_3_0= ruleMultiplicativeExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2941:1: (lv_rightOperand_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2941:1: (lv_rightOperand_3_0= ruleMultiplicativeExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2942:3: lv_rightOperand_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6400);
            	    lv_rightOperand_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2966:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2967:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2968:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6438);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression6448); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2975:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PowerExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2978:28: ( (this_PowerExpression_0= rulePowerExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2979:1: (this_PowerExpression_0= rulePowerExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2979:1: (this_PowerExpression_0= rulePowerExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2980:5: this_PowerExpression_0= rulePowerExpression ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getPowerExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePowerExpression_in_ruleMultiplicativeExpression6495);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PowerExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2988:1: ( () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=64 && LA45_0<=65)||(LA45_0>=77 && LA45_0<=78)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2988:2: () ( (lv_operator_2_0= ruleMultiplicativeOperator ) ) ( (lv_rightOperand_3_0= rulePowerExpression ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2988:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2989:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2994:2: ( (lv_operator_2_0= ruleMultiplicativeOperator ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2995:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2995:1: (lv_operator_2_0= ruleMultiplicativeOperator )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:2996:3: lv_operator_2_0= ruleMultiplicativeOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicativeExpression6525);
            	    lv_operator_2_0=ruleMultiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MultiplicativeOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3012:2: ( (lv_rightOperand_3_0= rulePowerExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3013:1: (lv_rightOperand_3_0= rulePowerExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3013:1: (lv_rightOperand_3_0= rulePowerExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3014:3: lv_rightOperand_3_0= rulePowerExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandPowerExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePowerExpression_in_ruleMultiplicativeExpression6546);
            	    lv_rightOperand_3_0=rulePowerExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"PowerExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRulePowerExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3038:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3039:2: (iv_rulePowerExpression= rulePowerExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3040:2: iv_rulePowerExpression= rulePowerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePowerExpression_in_entryRulePowerExpression6584);
            iv_rulePowerExpression=rulePowerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePowerExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePowerExpression6594); if (state.failed) return current;

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
    // $ANTLR end "entryRulePowerExpression"


    // $ANTLR start "rulePowerExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3047:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) ) )? ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_exponent_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3050:28: ( (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3051:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3051:1: (this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3052:5: this_UnaryExpression_0= ruleUnaryExpression ( () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_rulePowerExpression6641);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3060:1: ( () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==66||LA46_0==79) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3060:2: () ( (lv_operator_2_0= rulePowerOperator ) ) ( (lv_exponent_3_0= ruleUnaryExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3060:2: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3061:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPowerExpressionAccess().getPowerExpressionOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3066:2: ( (lv_operator_2_0= rulePowerOperator ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3067:1: (lv_operator_2_0= rulePowerOperator )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3067:1: (lv_operator_2_0= rulePowerOperator )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3068:3: lv_operator_2_0= rulePowerOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPowerExpressionAccess().getOperatorPowerOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePowerOperator_in_rulePowerExpression6671);
                    lv_operator_2_0=rulePowerOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPowerExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"PowerOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3084:2: ( (lv_exponent_3_0= ruleUnaryExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3085:1: (lv_exponent_3_0= ruleUnaryExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3085:1: (lv_exponent_3_0= ruleUnaryExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3086:3: lv_exponent_3_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPowerExpressionAccess().getExponentUnaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rulePowerExpression6692);
                    lv_exponent_3_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPowerExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"exponent",
                              		lv_exponent_3_0, 
                              		"UnaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePowerExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3110:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3111:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3112:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6730);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression6740); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3119:1: ruleUnaryExpression returns [EObject current=null] : (this_PostfixExpression_0= rulePostfixExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PostfixExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3122:28: ( (this_PostfixExpression_0= rulePostfixExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3123:1: (this_PostfixExpression_0= rulePostfixExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3123:1: (this_PostfixExpression_0= rulePostfixExpression | ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==15||LA47_0==27||LA47_0==40||(LA47_0>=56 && LA47_0<=57)||(LA47_0>=61 && LA47_0<=63)) ) {
                alt47=1;
            }
            else if ( (LA47_0==59||LA47_0==80) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3124:5: this_PostfixExpression_0= rulePostfixExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPostfixExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePostfixExpression_in_ruleUnaryExpression6787);
                    this_PostfixExpression_0=rulePostfixExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PostfixExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3133:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3133:6: ( () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3133:7: () ( (lv_operator_2_0= ruleUnaryOperator ) ) ( (lv_operand_3_0= rulePostfixExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3133:7: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3134:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnaryExpressionAccess().getUnaryExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3139:2: ( (lv_operator_2_0= ruleUnaryOperator ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3140:1: (lv_operator_2_0= ruleUnaryOperator )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3140:1: (lv_operator_2_0= ruleUnaryOperator )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3141:3: lv_operator_2_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperatorUnaryOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression6823);
                    lv_operator_2_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"UnaryOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3157:2: ( (lv_operand_3_0= rulePostfixExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3158:1: (lv_operand_3_0= rulePostfixExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3158:1: (lv_operand_3_0= rulePostfixExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3159:3: lv_operand_3_0= rulePostfixExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOperandPostfixExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixExpression_in_ruleUnaryExpression6844);
                    lv_operand_3_0=rulePostfixExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"PostfixExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePostfixExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3183:1: entryRulePostfixExpression returns [EObject current=null] : iv_rulePostfixExpression= rulePostfixExpression EOF ;
    public final EObject entryRulePostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3184:2: (iv_rulePostfixExpression= rulePostfixExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3185:2: iv_rulePostfixExpression= rulePostfixExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePostfixExpression_in_entryRulePostfixExpression6881);
            iv_rulePostfixExpression=rulePostfixExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfixExpression6891); if (state.failed) return current;

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
    // $ANTLR end "entryRulePostfixExpression"


    // $ANTLR start "rulePostfixExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3192:1: rulePostfixExpression returns [EObject current=null] : (this_ArrayElementAccess_0= ruleArrayElementAccess ( () ( (lv_operator_2_0= rulePostfixOperator ) ) )? ) ;
    public final EObject rulePostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArrayElementAccess_0 = null;

        Enumerator lv_operator_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3195:28: ( (this_ArrayElementAccess_0= ruleArrayElementAccess ( () ( (lv_operator_2_0= rulePostfixOperator ) ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3196:1: (this_ArrayElementAccess_0= ruleArrayElementAccess ( () ( (lv_operator_2_0= rulePostfixOperator ) ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3196:1: (this_ArrayElementAccess_0= ruleArrayElementAccess ( () ( (lv_operator_2_0= rulePostfixOperator ) ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3197:5: this_ArrayElementAccess_0= ruleArrayElementAccess ( () ( (lv_operator_2_0= rulePostfixOperator ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixExpressionAccess().getArrayElementAccessParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleArrayElementAccess_in_rulePostfixExpression6938);
            this_ArrayElementAccess_0=ruleArrayElementAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArrayElementAccess_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3205:1: ( () ( (lv_operator_2_0= rulePostfixOperator ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==81) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3205:2: () ( (lv_operator_2_0= rulePostfixOperator ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3205:2: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3206:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixExpressionAccess().getPostfixExpressionOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3211:2: ( (lv_operator_2_0= rulePostfixOperator ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3212:1: (lv_operator_2_0= rulePostfixOperator )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3212:1: (lv_operator_2_0= rulePostfixOperator )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3213:3: lv_operator_2_0= rulePostfixOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixExpressionAccess().getOperatorPostfixOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePostfixOperator_in_rulePostfixExpression6968);
                    lv_operator_2_0=rulePostfixOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_2_0, 
                              		"PostfixOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePostfixExpression"


    // $ANTLR start "entryRuleArrayElementAccess"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3237:1: entryRuleArrayElementAccess returns [EObject current=null] : iv_ruleArrayElementAccess= ruleArrayElementAccess EOF ;
    public final EObject entryRuleArrayElementAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayElementAccess = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3238:2: (iv_ruleArrayElementAccess= ruleArrayElementAccess EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3239:2: iv_ruleArrayElementAccess= ruleArrayElementAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayElementAccessRule()); 
            }
            pushFollow(FOLLOW_ruleArrayElementAccess_in_entryRuleArrayElementAccess7006);
            iv_ruleArrayElementAccess=ruleArrayElementAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayElementAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayElementAccess7016); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayElementAccess"


    // $ANTLR start "ruleArrayElementAccess"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3246:1: ruleArrayElementAccess returns [EObject current=null] : (this_MemberFeatureCall_0= ruleMemberFeatureCall ( () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']' )* ) ;
    public final EObject ruleArrayElementAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_MemberFeatureCall_0 = null;

        EObject lv_subscripts_3_0 = null;

        EObject lv_subscripts_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3249:28: ( (this_MemberFeatureCall_0= ruleMemberFeatureCall ( () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']' )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3250:1: (this_MemberFeatureCall_0= ruleMemberFeatureCall ( () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']' )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3250:1: (this_MemberFeatureCall_0= ruleMemberFeatureCall ( () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']' )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3251:5: this_MemberFeatureCall_0= ruleMemberFeatureCall ( () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']' )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayElementAccessAccess().getMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMemberFeatureCall_in_ruleArrayElementAccess7063);
            this_MemberFeatureCall_0=ruleMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3259:1: ( () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']' )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==40) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3259:2: () otherlv_2= '[' ( (lv_subscripts_3_0= ruleArraySubscript ) ) (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )* otherlv_6= ']'
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3259:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3260:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getArrayElementAccessAccess().getArrayElementAccessArrayAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleArrayElementAccess7084); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayElementAccessAccess().getLeftSquareBracketKeyword_1_1());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3269:1: ( (lv_subscripts_3_0= ruleArraySubscript ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3270:1: (lv_subscripts_3_0= ruleArraySubscript )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3270:1: (lv_subscripts_3_0= ruleArraySubscript )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3271:3: lv_subscripts_3_0= ruleArraySubscript
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayElementAccessAccess().getSubscriptsArraySubscriptParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArraySubscript_in_ruleArrayElementAccess7105);
            	    lv_subscripts_3_0=ruleArraySubscript();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayElementAccessRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subscripts",
            	              		lv_subscripts_3_0, 
            	              		"ArraySubscript");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3287:2: (otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==16) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3287:4: otherlv_4= ',' ( (lv_subscripts_5_0= ruleArraySubscript ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleArrayElementAccess7118); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getArrayElementAccessAccess().getCommaKeyword_1_3_0());
            	    	          
            	    	    }
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3291:1: ( (lv_subscripts_5_0= ruleArraySubscript ) )
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3292:1: (lv_subscripts_5_0= ruleArraySubscript )
            	    	    {
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3292:1: (lv_subscripts_5_0= ruleArraySubscript )
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3293:3: lv_subscripts_5_0= ruleArraySubscript
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getArrayElementAccessAccess().getSubscriptsArraySubscriptParserRuleCall_1_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleArraySubscript_in_ruleArrayElementAccess7139);
            	    	    lv_subscripts_5_0=ruleArraySubscript();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getArrayElementAccessRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"subscripts",
            	    	              		lv_subscripts_5_0, 
            	    	              		"ArraySubscript");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop49;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleArrayElementAccess7153); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getArrayElementAccessAccess().getRightSquareBracketKeyword_1_4());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayElementAccess"


    // $ANTLR start "entryRuleMemberFeatureCall"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3321:1: entryRuleMemberFeatureCall returns [EObject current=null] : iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF ;
    public final EObject entryRuleMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberFeatureCall = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3322:2: (iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3323:2: iv_ruleMemberFeatureCall= ruleMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleMemberFeatureCall_in_entryRuleMemberFeatureCall7191);
            iv_ruleMemberFeatureCall=ruleMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMemberFeatureCall7201); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMemberFeatureCall"


    // $ANTLR start "ruleMemberFeatureCall"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3330:1: ruleMemberFeatureCall returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )* ) ;
    public final EObject ruleMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_arguments_10_0 = null;

        AntlrDatatypeRuleToken lv_identifier_14_0 = null;

        EObject lv_variables_16_0 = null;

        EObject lv_variables_18_0 = null;

        EObject lv_accumulator_20_0 = null;

        EObject lv_breakCondition_22_0 = null;

        EObject lv_expression_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3333:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3334:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3334:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3335:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMemberFeatureCall7248);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3343:1: ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )*
            loop56:
            do {
                int alt56=4;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3343:2: ( () otherlv_2= '.' ( ( ruleValidID ) ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3343:2: ( () otherlv_2= '.' ( ( ruleValidID ) ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3343:3: () otherlv_2= '.' ( ( ruleValidID ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3343:3: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3344:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getMemberVariableAccessTargetAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleMemberFeatureCall7270); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_0_1());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3353:1: ( ( ruleValidID ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3354:1: ( ruleValidID )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3354:1: ( ruleValidID )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3355:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getMemberVariableCallableElementCrossReference_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleMemberFeatureCall7293);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3369:6: ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3369:6: ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3369:7: () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')'
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3369:7: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3370:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getMemberFeatureCallAccess().getFunctionCallArgumentsAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,54,FOLLOW_54_in_ruleMemberFeatureCall7322); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_1_1());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3379:1: ( ( ruleValidID ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3380:1: ( ruleValidID )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3380:1: ( ruleValidID )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3381:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getFeatureCallableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleMemberFeatureCall7345);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMemberFeatureCall7357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getMemberFeatureCallAccess().getLeftParenthesisKeyword_1_1_3());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3398:1: ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_INT)||LA52_0==15||LA52_0==27||LA52_0==30||LA52_0==40||LA52_0==42||LA52_0==44||LA52_0==47||(LA52_0>=56 && LA52_0<=57)||LA52_0==59||(LA52_0>=61 && LA52_0<=63)||LA52_0==80) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3398:2: ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )*
            	            {
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3398:2: ( (lv_arguments_8_0= ruleExpression ) )
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3399:1: (lv_arguments_8_0= ruleExpression )
            	            {
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3399:1: (lv_arguments_8_0= ruleExpression )
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3400:3: lv_arguments_8_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_1_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall7379);
            	            lv_arguments_8_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"arguments",
            	                      		lv_arguments_8_0, 
            	                      		"Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3416:2: (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )*
            	            loop51:
            	            do {
            	                int alt51=2;
            	                int LA51_0 = input.LA(1);

            	                if ( (LA51_0==16) ) {
            	                    alt51=1;
            	                }


            	                switch (alt51) {
            	            	case 1 :
            	            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3416:4: otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) )
            	            	    {
            	            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleMemberFeatureCall7392); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_9, grammarAccess.getMemberFeatureCallAccess().getCommaKeyword_1_1_4_1_0());
            	            	          
            	            	    }
            	            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3420:1: ( (lv_arguments_10_0= ruleExpression ) )
            	            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3421:1: (lv_arguments_10_0= ruleExpression )
            	            	    {
            	            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3421:1: (lv_arguments_10_0= ruleExpression )
            	            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3422:3: lv_arguments_10_0= ruleExpression
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_1_4_1_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall7413);
            	            	    lv_arguments_10_0=ruleExpression();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"arguments",
            	            	              		lv_arguments_10_0, 
            	            	              		"Expression");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop51;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleMemberFeatureCall7429); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_5());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3443:6: ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3443:6: ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3443:7: () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')'
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3443:7: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3444:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMemberFeatureCallAccess().getIterationCallTargetAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleMemberFeatureCall7458); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getMemberFeatureCallAccess().getFullStopKeyword_1_2_1());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3453:1: ( (lv_identifier_14_0= ruleValidID ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3454:1: (lv_identifier_14_0= ruleValidID )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3454:1: (lv_identifier_14_0= ruleValidID )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3455:3: lv_identifier_14_0= ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getIdentifierValidIDParserRuleCall_1_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleMemberFeatureCall7479);
            	    lv_identifier_14_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"identifier",
            	              		lv_identifier_14_0, 
            	              		"ValidID");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleMemberFeatureCall7491); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getMemberFeatureCallAccess().getLeftParenthesisKeyword_1_2_3());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3475:1: ( (lv_variables_16_0= ruleIterationVariable ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3476:1: (lv_variables_16_0= ruleIterationVariable )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3476:1: (lv_variables_16_0= ruleIterationVariable )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3477:3: lv_variables_16_0= ruleIterationVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getVariablesIterationVariableParserRuleCall_1_2_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleIterationVariable_in_ruleMemberFeatureCall7512);
            	    lv_variables_16_0=ruleIterationVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variables",
            	              		lv_variables_16_0, 
            	              		"IterationVariable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3493:2: (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==16) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3493:4: otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleMemberFeatureCall7525); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_17, grammarAccess.getMemberFeatureCallAccess().getCommaKeyword_1_2_5_0());
            	    	          
            	    	    }
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3497:1: ( (lv_variables_18_0= ruleIterationVariable ) )
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3498:1: (lv_variables_18_0= ruleIterationVariable )
            	    	    {
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3498:1: (lv_variables_18_0= ruleIterationVariable )
            	    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3499:3: lv_variables_18_0= ruleIterationVariable
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getVariablesIterationVariableParserRuleCall_1_2_5_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleIterationVariable_in_ruleMemberFeatureCall7546);
            	    	    lv_variables_18_0=ruleIterationVariable();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"variables",
            	    	              		lv_variables_18_0, 
            	    	              		"IterationVariable");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3515:4: (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==20) ) {
            	        int LA54_1 = input.LA(2);

            	        if ( (LA54_1==RULE_N) ) {
            	            int LA54_3 = input.LA(3);

            	            if ( (LA54_3==19) ) {
            	                alt54=1;
            	            }
            	        }
            	        else if ( (LA54_1==RULE_ID) ) {
            	            int LA54_4 = input.LA(3);

            	            if ( (LA54_4==19) ) {
            	                alt54=1;
            	            }
            	        }
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3515:6: otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) )
            	            {
            	            otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleMemberFeatureCall7561); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_19, grammarAccess.getMemberFeatureCallAccess().getSemicolonKeyword_1_2_6_0());
            	                  
            	            }
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3519:1: ( (lv_accumulator_20_0= ruleIterationAccumulator ) )
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3520:1: (lv_accumulator_20_0= ruleIterationAccumulator )
            	            {
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3520:1: (lv_accumulator_20_0= ruleIterationAccumulator )
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3521:3: lv_accumulator_20_0= ruleIterationAccumulator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getAccumulatorIterationAccumulatorParserRuleCall_1_2_6_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleIterationAccumulator_in_ruleMemberFeatureCall7582);
            	            lv_accumulator_20_0=ruleIterationAccumulator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"accumulator",
            	                      		lv_accumulator_20_0, 
            	                      		"IterationAccumulator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3537:4: (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==20) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3537:6: otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) )
            	            {
            	            otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleMemberFeatureCall7597); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getMemberFeatureCallAccess().getSemicolonKeyword_1_2_7_0());
            	                  
            	            }
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3541:1: ( (lv_breakCondition_22_0= ruleExpression ) )
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3542:1: (lv_breakCondition_22_0= ruleExpression )
            	            {
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3542:1: (lv_breakCondition_22_0= ruleExpression )
            	            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3543:3: lv_breakCondition_22_0= ruleExpression
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getBreakConditionExpressionParserRuleCall_1_2_7_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall7618);
            	            lv_breakCondition_22_0=ruleExpression();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"breakCondition",
            	                      		lv_breakCondition_22_0, 
            	                      		"Expression");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_23=(Token)match(input,55,FOLLOW_55_in_ruleMemberFeatureCall7632); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_23, grammarAccess.getMemberFeatureCallAccess().getVerticalLineKeyword_1_2_8());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3563:1: ( (lv_expression_24_0= ruleExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3564:1: (lv_expression_24_0= ruleExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3564:1: (lv_expression_24_0= ruleExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3565:3: lv_expression_24_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMemberFeatureCallAccess().getExpressionExpressionParserRuleCall_1_2_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleMemberFeatureCall7653);
            	    lv_expression_24_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"expression",
            	              		lv_expression_24_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_25=(Token)match(input,28,FOLLOW_28_in_ruleMemberFeatureCall7665); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getMemberFeatureCallAccess().getRightParenthesisKeyword_1_2_10());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMemberFeatureCall"


    // $ANTLR start "entryRuleIterationVariable"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3593:1: entryRuleIterationVariable returns [EObject current=null] : iv_ruleIterationVariable= ruleIterationVariable EOF ;
    public final EObject entryRuleIterationVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationVariable = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3594:2: (iv_ruleIterationVariable= ruleIterationVariable EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3595:2: iv_ruleIterationVariable= ruleIterationVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationVariableRule()); 
            }
            pushFollow(FOLLOW_ruleIterationVariable_in_entryRuleIterationVariable7704);
            iv_ruleIterationVariable=ruleIterationVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterationVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationVariable7714); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterationVariable"


    // $ANTLR start "ruleIterationVariable"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3602:1: ruleIterationVariable returns [EObject current=null] : ( (lv_name_0_0= ruleValidID ) ) ;
    public final EObject ruleIterationVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3605:28: ( ( (lv_name_0_0= ruleValidID ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3606:1: ( (lv_name_0_0= ruleValidID ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3606:1: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3607:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3607:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3608:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIterationVariableAccess().getNameValidIDParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleIterationVariable7759);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIterationVariableRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIterationVariable"


    // $ANTLR start "entryRuleIterationAccumulator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3632:1: entryRuleIterationAccumulator returns [EObject current=null] : iv_ruleIterationAccumulator= ruleIterationAccumulator EOF ;
    public final EObject entryRuleIterationAccumulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationAccumulator = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3633:2: (iv_ruleIterationAccumulator= ruleIterationAccumulator EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3634:2: iv_ruleIterationAccumulator= ruleIterationAccumulator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIterationAccumulatorRule()); 
            }
            pushFollow(FOLLOW_ruleIterationAccumulator_in_entryRuleIterationAccumulator7794);
            iv_ruleIterationAccumulator=ruleIterationAccumulator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIterationAccumulator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIterationAccumulator7804); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIterationAccumulator"


    // $ANTLR start "ruleIterationAccumulator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3641:1: ruleIterationAccumulator returns [EObject current=null] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ( (lv_initializer_2_0= ruleExpression ) ) ) ;
    public final EObject ruleIterationAccumulator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_initializer_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3644:28: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ( (lv_initializer_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3645:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ( (lv_initializer_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3645:1: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ( (lv_initializer_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3645:2: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ( (lv_initializer_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3645:2: ( (lv_name_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3646:1: (lv_name_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3646:1: (lv_name_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3647:3: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIterationAccumulatorAccess().getNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleIterationAccumulator7850);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIterationAccumulatorRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleIterationAccumulator7862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIterationAccumulatorAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3667:1: ( (lv_initializer_2_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3668:1: (lv_initializer_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3668:1: (lv_initializer_2_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3669:3: lv_initializer_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIterationAccumulatorAccess().getInitializerExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIterationAccumulator7883);
            lv_initializer_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIterationAccumulatorRule());
              	        }
                     		set(
                     			current, 
                     			"initializer",
                      		lv_initializer_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIterationAccumulator"


    // $ANTLR start "entryRuleArraySubscript"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3693:1: entryRuleArraySubscript returns [EObject current=null] : iv_ruleArraySubscript= ruleArraySubscript EOF ;
    public final EObject entryRuleArraySubscript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySubscript = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3694:2: (iv_ruleArraySubscript= ruleArraySubscript EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3695:2: iv_ruleArraySubscript= ruleArraySubscript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySubscriptRule()); 
            }
            pushFollow(FOLLOW_ruleArraySubscript_in_entryRuleArraySubscript7919);
            iv_ruleArraySubscript=ruleArraySubscript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySubscript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArraySubscript7929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySubscript"


    // $ANTLR start "ruleArraySubscript"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3702:1: ruleArraySubscript returns [EObject current=null] : ( ( (lv_slice_0_0= ':' ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleArraySubscript() throws RecognitionException {
        EObject current = null;

        Token lv_slice_0_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3705:28: ( ( ( (lv_slice_0_0= ':' ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3706:1: ( ( (lv_slice_0_0= ':' ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3706:1: ( ( (lv_slice_0_0= ':' ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==22) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=RULE_ID && LA57_0<=RULE_INT)||LA57_0==15||LA57_0==27||LA57_0==30||LA57_0==40||LA57_0==42||LA57_0==44||LA57_0==47||(LA57_0>=56 && LA57_0<=57)||LA57_0==59||(LA57_0>=61 && LA57_0<=63)||LA57_0==80) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3706:2: ( (lv_slice_0_0= ':' ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3706:2: ( (lv_slice_0_0= ':' ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3707:1: (lv_slice_0_0= ':' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3707:1: (lv_slice_0_0= ':' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3708:3: lv_slice_0_0= ':'
                    {
                    lv_slice_0_0=(Token)match(input,22,FOLLOW_22_in_ruleArraySubscript7972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_slice_0_0, grammarAccess.getArraySubscriptAccess().getSliceColonKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArraySubscriptRule());
                      	        }
                             		setWithLastConsumed(current, "slice", true, ":");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3722:6: ( (lv_expression_1_0= ruleExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3722:6: ( (lv_expression_1_0= ruleExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3723:1: (lv_expression_1_0= ruleExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3723:1: (lv_expression_1_0= ruleExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3724:3: lv_expression_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArraySubscriptAccess().getExpressionExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleArraySubscript8012);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArraySubscriptRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArraySubscript"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3748:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3749:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3750:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8048);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression8058); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3757:1: rulePrimaryExpression returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_FeatureCall_1= ruleFeatureCall | this_UnitConstructionOperator_2= ruleUnitConstructionOperator | this_ArrayConstructionOperator_3= ruleArrayConstructionOperator | this_ArrayConcatenationOperator_4= ruleArrayConcatenationOperator | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_BeginExpression_6= ruleBeginExpression | this_EndExpression_7= ruleEndExpression ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_FeatureCall_1 = null;

        EObject this_UnitConstructionOperator_2 = null;

        EObject this_ArrayConstructionOperator_3 = null;

        EObject this_ArrayConcatenationOperator_4 = null;

        EObject this_ParenthesizedExpression_5 = null;

        EObject this_BeginExpression_6 = null;

        EObject this_EndExpression_7 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3760:28: ( (this_Literal_0= ruleLiteral | this_FeatureCall_1= ruleFeatureCall | this_UnitConstructionOperator_2= ruleUnitConstructionOperator | this_ArrayConstructionOperator_3= ruleArrayConstructionOperator | this_ArrayConcatenationOperator_4= ruleArrayConcatenationOperator | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_BeginExpression_6= ruleBeginExpression | this_EndExpression_7= ruleEndExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3761:1: (this_Literal_0= ruleLiteral | this_FeatureCall_1= ruleFeatureCall | this_UnitConstructionOperator_2= ruleUnitConstructionOperator | this_ArrayConstructionOperator_3= ruleArrayConstructionOperator | this_ArrayConcatenationOperator_4= ruleArrayConcatenationOperator | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_BeginExpression_6= ruleBeginExpression | this_EndExpression_7= ruleEndExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3761:1: (this_Literal_0= ruleLiteral | this_FeatureCall_1= ruleFeatureCall | this_UnitConstructionOperator_2= ruleUnitConstructionOperator | this_ArrayConstructionOperator_3= ruleArrayConstructionOperator | this_ArrayConcatenationOperator_4= ruleArrayConcatenationOperator | this_ParenthesizedExpression_5= ruleParenthesizedExpression | this_BeginExpression_6= ruleBeginExpression | this_EndExpression_7= ruleEndExpression )
            int alt58=8;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ONE:
            case RULE_REAL:
            case RULE_INT:
            case 56:
            case 57:
                {
                alt58=1;
                }
                break;
            case RULE_ID:
            case RULE_N:
                {
                alt58=2;
                }
                break;
            case 61:
                {
                alt58=3;
                }
                break;
            case 15:
                {
                alt58=4;
                }
                break;
            case 40:
                {
                alt58=5;
                }
                break;
            case 27:
                {
                alt58=6;
                }
                break;
            case 62:
                {
                alt58=7;
                }
                break;
            case 63:
                {
                alt58=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3762:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression8105);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3772:5: this_FeatureCall_1= ruleFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFeatureCallParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8132);
                    this_FeatureCall_1=ruleFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FeatureCall_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3782:5: this_UnitConstructionOperator_2= ruleUnitConstructionOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnitConstructionOperatorParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnitConstructionOperator_in_rulePrimaryExpression8159);
                    this_UnitConstructionOperator_2=ruleUnitConstructionOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnitConstructionOperator_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3792:5: this_ArrayConstructionOperator_3= ruleArrayConstructionOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayConstructionOperatorParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayConstructionOperator_in_rulePrimaryExpression8186);
                    this_ArrayConstructionOperator_3=ruleArrayConstructionOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayConstructionOperator_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3802:5: this_ArrayConcatenationOperator_4= ruleArrayConcatenationOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayConcatenationOperatorParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayConcatenationOperator_in_rulePrimaryExpression8213);
                    this_ArrayConcatenationOperator_4=ruleArrayConcatenationOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayConcatenationOperator_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3812:5: this_ParenthesizedExpression_5= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParenthesizedExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression8240);
                    this_ParenthesizedExpression_5=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3822:5: this_BeginExpression_6= ruleBeginExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBeginExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBeginExpression_in_rulePrimaryExpression8267);
                    this_BeginExpression_6=ruleBeginExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BeginExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3832:5: this_EndExpression_7= ruleEndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEndExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEndExpression_in_rulePrimaryExpression8294);
                    this_EndExpression_7=ruleEndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EndExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3848:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3849:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3850:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral8329);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral8339); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3857:1: ruleLiteral returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumericLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_StringLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3860:28: ( (this_NumericLiteral_0= ruleNumericLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3861:1: (this_NumericLiteral_0= ruleNumericLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3861:1: (this_NumericLiteral_0= ruleNumericLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_StringLiteral_2= ruleStringLiteral )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_ONE:
            case RULE_REAL:
            case RULE_INT:
                {
                alt59=1;
                }
                break;
            case 56:
            case 57:
                {
                alt59=2;
                }
                break;
            case RULE_STRING:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3862:5: this_NumericLiteral_0= ruleNumericLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumericLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumericLiteral_in_ruleLiteral8386);
                    this_NumericLiteral_0=ruleNumericLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumericLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3872:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteral8413);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3882:5: this_StringLiteral_2= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral8440);
                    this_StringLiteral_2=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumericLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3898:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3899:2: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3900:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral8475);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumericLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericLiteral8485); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3907:1: ruleNumericLiteral returns [EObject current=null] : (this_RealLiteral_0= ruleRealLiteral | this_IntegerLiteral_1= ruleIntegerLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_RealLiteral_0 = null;

        EObject this_IntegerLiteral_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3910:28: ( (this_RealLiteral_0= ruleRealLiteral | this_IntegerLiteral_1= ruleIntegerLiteral ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3911:1: (this_RealLiteral_0= ruleRealLiteral | this_IntegerLiteral_1= ruleIntegerLiteral )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3911:1: (this_RealLiteral_0= ruleRealLiteral | this_IntegerLiteral_1= ruleIntegerLiteral )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_REAL) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ONE||LA60_0==RULE_INT) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3912:5: this_RealLiteral_0= ruleRealLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealLiteral_in_ruleNumericLiteral8532);
                    this_RealLiteral_0=ruleRealLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3922:5: this_IntegerLiteral_1= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleNumericLiteral8559);
                    this_IntegerLiteral_1=ruleIntegerLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3938:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3939:2: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3940:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral8594);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealLiteral8604); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3947:1: ruleRealLiteral returns [EObject current=null] : ( ( (lv_value_0_0= ruleValidDouble ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_modifier_1_0 = null;

        EObject lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3950:28: ( ( ( (lv_value_0_0= ruleValidDouble ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3951:1: ( ( (lv_value_0_0= ruleValidDouble ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3951:1: ( ( (lv_value_0_0= ruleValidDouble ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3951:2: ( (lv_value_0_0= ruleValidDouble ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3951:2: ( (lv_value_0_0= ruleValidDouble ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3952:1: (lv_value_0_0= ruleValidDouble )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3952:1: (lv_value_0_0= ruleValidDouble )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3953:3: lv_value_0_0= ruleValidDouble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealLiteralAccess().getValueValidDoubleParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidDouble_in_ruleRealLiteral8650);
            lv_value_0_0=ruleValidDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRealLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ValidDouble");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3969:2: ( (lv_modifier_1_0= ruleValidID ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==RULE_N) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3970:1: (lv_modifier_1_0= ruleValidID )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3970:1: (lv_modifier_1_0= ruleValidID )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3971:3: lv_modifier_1_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealLiteralAccess().getModifierValidIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleRealLiteral8671);
                    lv_modifier_1_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"modifier",
                              		lv_modifier_1_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3987:3: (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==27) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3987:5: otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleRealLiteral8685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRealLiteralAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3991:1: ( (lv_unit_3_0= ruleUnit ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3992:1: (lv_unit_3_0= ruleUnit )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3992:1: (lv_unit_3_0= ruleUnit )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:3993:3: lv_unit_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealLiteralAccess().getUnitUnitParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleRealLiteral8706);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleRealLiteral8718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRealLiteralAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4021:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4022:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4023:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral8756);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral8766); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4030:1: ruleIntegerLiteral returns [EObject current=null] : ( ( (lv_value_0_0= ruleValidLong ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_modifier_1_0 = null;

        EObject lv_unit_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4033:28: ( ( ( (lv_value_0_0= ruleValidLong ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4034:1: ( ( (lv_value_0_0= ruleValidLong ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4034:1: ( ( (lv_value_0_0= ruleValidLong ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4034:2: ( (lv_value_0_0= ruleValidLong ) ) ( (lv_modifier_1_0= ruleValidID ) )? (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4034:2: ( (lv_value_0_0= ruleValidLong ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4035:1: (lv_value_0_0= ruleValidLong )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4035:1: (lv_value_0_0= ruleValidLong )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4036:3: lv_value_0_0= ruleValidLong
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValueValidLongParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidLong_in_ruleIntegerLiteral8812);
            lv_value_0_0=ruleValidLong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ValidLong");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4052:2: ( (lv_modifier_1_0= ruleValidID ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||LA63_0==RULE_N) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4053:1: (lv_modifier_1_0= ruleValidID )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4053:1: (lv_modifier_1_0= ruleValidID )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4054:3: lv_modifier_1_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getModifierValidIDParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIntegerLiteral8833);
                    lv_modifier_1_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"modifier",
                              		lv_modifier_1_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4070:3: (otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4070:5: otherlv_2= '(' ( (lv_unit_3_0= ruleUnit ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleIntegerLiteral8847); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getIntegerLiteralAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4074:1: ( (lv_unit_3_0= ruleUnit ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4075:1: (lv_unit_3_0= ruleUnit )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4075:1: (lv_unit_3_0= ruleUnit )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4076:3: lv_unit_3_0= ruleUnit
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIntegerLiteralAccess().getUnitUnitParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleIntegerLiteral8868);
                    lv_unit_3_0=ruleUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
                      	        }
                             		set(
                             			current, 
                             			"unit",
                              		lv_unit_3_0, 
                              		"Unit");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleIntegerLiteral8880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getIntegerLiteralAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4104:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4105:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4106:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8918);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8928); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4113:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_true_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4116:28: ( ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4117:1: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4117:1: ( () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4117:2: () ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4117:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4118:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4123:2: ( ( (lv_true_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            else if ( (LA65_0==57) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4123:3: ( (lv_true_1_0= 'true' ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4123:3: ( (lv_true_1_0= 'true' ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4124:1: (lv_true_1_0= 'true' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4124:1: (lv_true_1_0= 'true' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4125:3: lv_true_1_0= 'true'
                    {
                    lv_true_1_0=(Token)match(input,56,FOLLOW_56_in_ruleBooleanLiteral8981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_true_1_0, grammarAccess.getBooleanLiteralAccess().getTrueTrueKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "true", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4139:7: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleBooleanLiteral9012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4151:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4152:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4153:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9049);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9059); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4160:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4163:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4164:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4164:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4165:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4165:1: (lv_value_0_0= RULE_STRING )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4166:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleFeatureCall"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4190:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4191:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4192:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9140);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall9150); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4199:1: ruleFeatureCall returns [EObject current=null] : ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? ) | ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) ) ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_stepExpression_3_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_arguments_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4202:28: ( ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? ) | ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4203:1: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? ) | ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4203:1: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? ) | ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) ) )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4203:2: ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4203:2: ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4203:3: () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )?
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4203:3: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4204:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFeatureCallAccess().getVariableAccessAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4209:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4210:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4210:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4211:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getFeatureCallableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureCall9208);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4224:2: (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==15) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4224:4: otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleFeatureCall9221); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getFeatureCallAccess().getLeftCurlyBracketKeyword_0_2_0());
                                  
                            }
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4228:1: ( (lv_stepExpression_3_0= ruleStepExpression ) )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4229:1: (lv_stepExpression_3_0= ruleStepExpression )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4229:1: (lv_stepExpression_3_0= ruleStepExpression )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4230:3: lv_stepExpression_3_0= ruleStepExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getStepExpressionStepExpressionParserRuleCall_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleStepExpression_in_ruleFeatureCall9242);
                            lv_stepExpression_3_0=ruleStepExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"stepExpression",
                                      		lv_stepExpression_3_0, 
                                      		"StepExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFeatureCall9254); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getFeatureCallAccess().getRightCurlyBracketKeyword_0_2_2());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:6: ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:6: ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:7: ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4267:5: ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4267:6: () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')'
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4267:6: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4268:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getFeatureCallAccess().getFunctionCallAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4273:2: ( ( ruleQualifiedName ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4274:1: ( ruleQualifiedName )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4274:1: ( ruleQualifiedName )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4275:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getFeatureCallableElementCrossReference_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleFeatureCall9352);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleFeatureCall9364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFeatureCallAccess().getLeftParenthesisKeyword_1_0_2());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4292:1: ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( ((LA68_0>=RULE_ID && LA68_0<=RULE_INT)||LA68_0==15||LA68_0==27||LA68_0==30||LA68_0==40||LA68_0==42||LA68_0==44||LA68_0==47||(LA68_0>=56 && LA68_0<=57)||LA68_0==59||(LA68_0>=61 && LA68_0<=63)||LA68_0==80) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4292:2: ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )*
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4292:2: ( (lv_arguments_8_0= ruleExpression ) )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4293:1: (lv_arguments_8_0= ruleExpression )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4293:1: (lv_arguments_8_0= ruleExpression )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4294:3: lv_arguments_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_0_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall9386);
                            lv_arguments_8_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_8_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4310:2: (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==16) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4310:4: otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) )
                            	    {
                            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleFeatureCall9399); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getFeatureCallAccess().getCommaKeyword_1_0_3_1_0());
                            	          
                            	    }
                            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4314:1: ( (lv_arguments_10_0= ruleExpression ) )
                            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4315:1: (lv_arguments_10_0= ruleExpression )
                            	    {
                            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4315:1: (lv_arguments_10_0= ruleExpression )
                            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4316:3: lv_arguments_10_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFeatureCallAccess().getArgumentsExpressionParserRuleCall_1_0_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleFeatureCall9420);
                            	    lv_arguments_10_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_10_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop67;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleFeatureCall9436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getFeatureCallAccess().getRightParenthesisKeyword_1_0_4());
                          
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4344:1: entryRuleStepExpression returns [EObject current=null] : iv_ruleStepExpression= ruleStepExpression EOF ;
    public final EObject entryRuleStepExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4345:2: (iv_ruleStepExpression= ruleStepExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4346:2: iv_ruleStepExpression= ruleStepExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleStepExpression_in_entryRuleStepExpression9474);
            iv_ruleStepExpression=ruleStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStepExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepExpression9484); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStepExpression"


    // $ANTLR start "ruleStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4353:1: ruleStepExpression returns [EObject current=null] : this_RangeStepExpression_0= ruleRangeStepExpression ;
    public final EObject ruleStepExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RangeStepExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4356:28: (this_RangeStepExpression_0= ruleRangeStepExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4358:5: this_RangeStepExpression_0= ruleRangeStepExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStepExpressionAccess().getRangeStepExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleRangeStepExpression_in_ruleStepExpression9530);
            this_RangeStepExpression_0=ruleRangeStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RangeStepExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStepExpression"


    // $ANTLR start "entryRuleRangeStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4374:1: entryRuleRangeStepExpression returns [EObject current=null] : iv_ruleRangeStepExpression= ruleRangeStepExpression EOF ;
    public final EObject entryRuleRangeStepExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeStepExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4375:2: (iv_ruleRangeStepExpression= ruleRangeStepExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4376:2: iv_ruleRangeStepExpression= ruleRangeStepExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeStepExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRangeStepExpression_in_entryRuleRangeStepExpression9564);
            iv_ruleRangeStepExpression=ruleRangeStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRangeStepExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeStepExpression9574); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRangeStepExpression"


    // $ANTLR start "ruleRangeStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4383:1: ruleRangeStepExpression returns [EObject current=null] : (this_AdditiveStepExpression_0= ruleAdditiveStepExpression ( () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) ) )? ) ;
    public final EObject ruleRangeStepExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AdditiveStepExpression_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4386:28: ( (this_AdditiveStepExpression_0= ruleAdditiveStepExpression ( () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4387:1: (this_AdditiveStepExpression_0= ruleAdditiveStepExpression ( () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4387:1: (this_AdditiveStepExpression_0= ruleAdditiveStepExpression ( () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4388:5: this_AdditiveStepExpression_0= ruleAdditiveStepExpression ( () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRangeStepExpressionAccess().getAdditiveStepExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveStepExpression_in_ruleRangeStepExpression9621);
            this_AdditiveStepExpression_0=ruleAdditiveStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveStepExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4396:1: ( () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==58) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4396:2: () otherlv_2= '..' ( (lv_end_3_0= ruleAdditiveStepExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4396:2: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4397:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getRangeStepExpressionAccess().getRangeStepExpressionStartAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleRangeStepExpression9642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRangeStepExpressionAccess().getFullStopFullStopKeyword_1_1());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4406:1: ( (lv_end_3_0= ruleAdditiveStepExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4407:1: (lv_end_3_0= ruleAdditiveStepExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4407:1: (lv_end_3_0= ruleAdditiveStepExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4408:3: lv_end_3_0= ruleAdditiveStepExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRangeStepExpressionAccess().getEndAdditiveStepExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAdditiveStepExpression_in_ruleRangeStepExpression9663);
                    lv_end_3_0=ruleAdditiveStepExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRangeStepExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"end",
                              		lv_end_3_0, 
                              		"AdditiveStepExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRangeStepExpression"


    // $ANTLR start "entryRuleAdditiveStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4432:1: entryRuleAdditiveStepExpression returns [EObject current=null] : iv_ruleAdditiveStepExpression= ruleAdditiveStepExpression EOF ;
    public final EObject entryRuleAdditiveStepExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveStepExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4433:2: (iv_ruleAdditiveStepExpression= ruleAdditiveStepExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4434:2: iv_ruleAdditiveStepExpression= ruleAdditiveStepExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveStepExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveStepExpression_in_entryRuleAdditiveStepExpression9701);
            iv_ruleAdditiveStepExpression=ruleAdditiveStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveStepExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveStepExpression9711); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveStepExpression"


    // $ANTLR start "ruleAdditiveStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4441:1: ruleAdditiveStepExpression returns [EObject current=null] : (this_NegateStepExpression_0= ruleNegateStepExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) ) )* ) ;
    public final EObject ruleAdditiveStepExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegateStepExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4444:28: ( (this_NegateStepExpression_0= ruleNegateStepExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4445:1: (this_NegateStepExpression_0= ruleNegateStepExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4445:1: (this_NegateStepExpression_0= ruleNegateStepExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4446:5: this_NegateStepExpression_0= ruleNegateStepExpression ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveStepExpressionAccess().getNegateStepExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegateStepExpression_in_ruleAdditiveStepExpression9758);
            this_NegateStepExpression_0=ruleNegateStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegateStepExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4454:1: ( () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==59||LA71_0==76) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4454:2: () ( (lv_operator_2_0= ruleAdditiveOperator ) ) ( (lv_rightOperand_3_0= ruleNegateStepExpression ) )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4454:2: ()
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4455:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveStepExpressionAccess().getAdditiveStepExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4460:2: ( (lv_operator_2_0= ruleAdditiveOperator ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4461:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4461:1: (lv_operator_2_0= ruleAdditiveOperator )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4462:3: lv_operator_2_0= ruleAdditiveOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveStepExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOperator_in_ruleAdditiveStepExpression9788);
            	    lv_operator_2_0=ruleAdditiveOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveStepExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AdditiveOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4478:2: ( (lv_rightOperand_3_0= ruleNegateStepExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4479:1: (lv_rightOperand_3_0= ruleNegateStepExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4479:1: (lv_rightOperand_3_0= ruleNegateStepExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4480:3: lv_rightOperand_3_0= ruleNegateStepExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveStepExpressionAccess().getRightOperandNegateStepExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNegateStepExpression_in_ruleAdditiveStepExpression9809);
            	    lv_rightOperand_3_0=ruleNegateStepExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveStepExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"NegateStepExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveStepExpression"


    // $ANTLR start "entryRuleNegateStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4504:1: entryRuleNegateStepExpression returns [EObject current=null] : iv_ruleNegateStepExpression= ruleNegateStepExpression EOF ;
    public final EObject entryRuleNegateStepExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegateStepExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4505:2: (iv_ruleNegateStepExpression= ruleNegateStepExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4506:2: iv_ruleNegateStepExpression= ruleNegateStepExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegateStepExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNegateStepExpression_in_entryRuleNegateStepExpression9847);
            iv_ruleNegateStepExpression=ruleNegateStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegateStepExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegateStepExpression9857); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegateStepExpression"


    // $ANTLR start "ruleNegateStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4513:1: ruleNegateStepExpression returns [EObject current=null] : (this_PrimitiveStepExpression_0= rulePrimitiveStepExpression | ( () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) ) ) ) ;
    public final EObject ruleNegateStepExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimitiveStepExpression_0 = null;

        EObject lv_operand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4516:28: ( (this_PrimitiveStepExpression_0= rulePrimitiveStepExpression | ( () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4517:1: (this_PrimitiveStepExpression_0= rulePrimitiveStepExpression | ( () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4517:1: (this_PrimitiveStepExpression_0= rulePrimitiveStepExpression | ( () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_N && LA72_0<=RULE_ONE)||LA72_0==RULE_INT) ) {
                alt72=1;
            }
            else if ( (LA72_0==59) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4518:5: this_PrimitiveStepExpression_0= rulePrimitiveStepExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegateStepExpressionAccess().getPrimitiveStepExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveStepExpression_in_ruleNegateStepExpression9904);
                    this_PrimitiveStepExpression_0=rulePrimitiveStepExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveStepExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4527:6: ( () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4527:6: ( () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4527:7: () otherlv_2= '-' ( (lv_operand_3_0= rulePrimitiveStepExpression ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4527:7: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4528:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegateStepExpressionAccess().getNegateStepExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleNegateStepExpression9931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNegateStepExpressionAccess().getHyphenMinusKeyword_1_1());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4537:1: ( (lv_operand_3_0= rulePrimitiveStepExpression ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4538:1: (lv_operand_3_0= rulePrimitiveStepExpression )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4538:1: (lv_operand_3_0= rulePrimitiveStepExpression )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4539:3: lv_operand_3_0= rulePrimitiveStepExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegateStepExpressionAccess().getOperandPrimitiveStepExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimitiveStepExpression_in_ruleNegateStepExpression9952);
                    lv_operand_3_0=rulePrimitiveStepExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNegateStepExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_3_0, 
                              		"PrimitiveStepExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNegateStepExpression"


    // $ANTLR start "entryRulePrimitiveStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4563:1: entryRulePrimitiveStepExpression returns [EObject current=null] : iv_rulePrimitiveStepExpression= rulePrimitiveStepExpression EOF ;
    public final EObject entryRulePrimitiveStepExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveStepExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4564:2: (iv_rulePrimitiveStepExpression= rulePrimitiveStepExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4565:2: iv_rulePrimitiveStepExpression= rulePrimitiveStepExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveStepExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveStepExpression_in_entryRulePrimitiveStepExpression9989);
            iv_rulePrimitiveStepExpression=rulePrimitiveStepExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveStepExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveStepExpression9999); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveStepExpression"


    // $ANTLR start "rulePrimitiveStepExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4572:1: rulePrimitiveStepExpression returns [EObject current=null] : (this_StepLiteral_0= ruleStepLiteral | this_StepN_1= ruleStepN ) ;
    public final EObject rulePrimitiveStepExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StepLiteral_0 = null;

        EObject this_StepN_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4575:28: ( (this_StepLiteral_0= ruleStepLiteral | this_StepN_1= ruleStepN ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4576:1: (this_StepLiteral_0= ruleStepLiteral | this_StepN_1= ruleStepN )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4576:1: (this_StepLiteral_0= ruleStepLiteral | this_StepN_1= ruleStepN )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ONE||LA73_0==RULE_INT) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_N) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4577:5: this_StepLiteral_0= ruleStepLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveStepExpressionAccess().getStepLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStepLiteral_in_rulePrimitiveStepExpression10046);
                    this_StepLiteral_0=ruleStepLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StepLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4587:5: this_StepN_1= ruleStepN
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveStepExpressionAccess().getStepNParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStepN_in_rulePrimitiveStepExpression10073);
                    this_StepN_1=ruleStepN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StepN_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimitiveStepExpression"


    // $ANTLR start "entryRuleStepLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4603:1: entryRuleStepLiteral returns [EObject current=null] : iv_ruleStepLiteral= ruleStepLiteral EOF ;
    public final EObject entryRuleStepLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepLiteral = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4604:2: (iv_ruleStepLiteral= ruleStepLiteral EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4605:2: iv_ruleStepLiteral= ruleStepLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStepLiteral_in_entryRuleStepLiteral10108);
            iv_ruleStepLiteral=ruleStepLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStepLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepLiteral10118); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStepLiteral"


    // $ANTLR start "ruleStepLiteral"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4612:1: ruleStepLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleValidInt ) ) ;
    public final EObject ruleStepLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4615:28: ( ( (lv_value_0_0= ruleValidInt ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4616:1: ( (lv_value_0_0= ruleValidInt ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4616:1: ( (lv_value_0_0= ruleValidInt ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4617:1: (lv_value_0_0= ruleValidInt )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4617:1: (lv_value_0_0= ruleValidInt )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4618:3: lv_value_0_0= ruleValidInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStepLiteralAccess().getValueValidIntParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidInt_in_ruleStepLiteral10163);
            lv_value_0_0=ruleValidInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStepLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ValidInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStepLiteral"


    // $ANTLR start "entryRuleStepN"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4642:1: entryRuleStepN returns [EObject current=null] : iv_ruleStepN= ruleStepN EOF ;
    public final EObject entryRuleStepN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepN = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4643:2: (iv_ruleStepN= ruleStepN EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4644:2: iv_ruleStepN= ruleStepN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStepNRule()); 
            }
            pushFollow(FOLLOW_ruleStepN_in_entryRuleStepN10198);
            iv_ruleStepN=ruleStepN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStepN; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepN10208); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStepN"


    // $ANTLR start "ruleStepN"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4651:1: ruleStepN returns [EObject current=null] : ( () this_N_1= RULE_N ) ;
    public final EObject ruleStepN() throws RecognitionException {
        EObject current = null;

        Token this_N_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4654:28: ( ( () this_N_1= RULE_N ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4655:1: ( () this_N_1= RULE_N )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4655:1: ( () this_N_1= RULE_N )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4655:2: () this_N_1= RULE_N
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4655:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4656:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStepNAccess().getStepNAction_0(),
                          current);
                  
            }

            }

            this_N_1=(Token)match(input,RULE_N,FOLLOW_RULE_N_in_ruleStepN10253); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_N_1, grammarAccess.getStepNAccess().getNTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStepN"


    // $ANTLR start "entryRuleArrayConstructionOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4673:1: entryRuleArrayConstructionOperator returns [EObject current=null] : iv_ruleArrayConstructionOperator= ruleArrayConstructionOperator EOF ;
    public final EObject entryRuleArrayConstructionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayConstructionOperator = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4674:2: (iv_ruleArrayConstructionOperator= ruleArrayConstructionOperator EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4675:2: iv_ruleArrayConstructionOperator= ruleArrayConstructionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayConstructionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleArrayConstructionOperator_in_entryRuleArrayConstructionOperator10288);
            iv_ruleArrayConstructionOperator=ruleArrayConstructionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayConstructionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayConstructionOperator10298); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayConstructionOperator"


    // $ANTLR start "ruleArrayConstructionOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4682:1: ruleArrayConstructionOperator returns [EObject current=null] : (otherlv_0= '{' ( (lv_expressions_1_0= ruleExpression ) ) ( (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* | (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* ) ) otherlv_8= '}' ) ;
    public final EObject ruleArrayConstructionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;

        EObject lv_iterationClauses_5_0 = null;

        EObject lv_iterationClauses_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4685:28: ( (otherlv_0= '{' ( (lv_expressions_1_0= ruleExpression ) ) ( (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* | (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* ) ) otherlv_8= '}' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4686:1: (otherlv_0= '{' ( (lv_expressions_1_0= ruleExpression ) ) ( (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* | (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* ) ) otherlv_8= '}' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4686:1: (otherlv_0= '{' ( (lv_expressions_1_0= ruleExpression ) ) ( (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* | (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* ) ) otherlv_8= '}' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4686:3: otherlv_0= '{' ( (lv_expressions_1_0= ruleExpression ) ) ( (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* | (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleArrayConstructionOperator10335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayConstructionOperatorAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4690:1: ( (lv_expressions_1_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4691:1: (lv_expressions_1_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4691:1: (lv_expressions_1_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4692:3: lv_expressions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayConstructionOperatorAccess().getExpressionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArrayConstructionOperator10356);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayConstructionOperatorRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4708:2: ( (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* | (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=16 && LA76_0<=17)) ) {
                alt76=1;
            }
            else if ( (LA76_0==60) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4708:3: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4708:3: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==16) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4708:5: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleArrayConstructionOperator10370); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getArrayConstructionOperatorAccess().getCommaKeyword_2_0_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4712:1: ( (lv_expressions_3_0= ruleExpression ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4713:1: (lv_expressions_3_0= ruleExpression )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4713:1: (lv_expressions_3_0= ruleExpression )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4714:3: lv_expressions_3_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayConstructionOperatorAccess().getExpressionsExpressionParserRuleCall_2_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayConstructionOperator10391);
                    	    lv_expressions_3_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArrayConstructionOperatorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"expressions",
                    	              		lv_expressions_3_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4731:6: (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4731:6: (otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )* )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4731:8: otherlv_4= 'for' ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) ) (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )*
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_60_in_ruleArrayConstructionOperator10412); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArrayConstructionOperatorAccess().getForKeyword_2_1_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4735:1: ( (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4736:1: (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4736:1: (lv_iterationClauses_5_0= ruleArrayConstructionIterationClause )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4737:3: lv_iterationClauses_5_0= ruleArrayConstructionIterationClause
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayConstructionOperatorAccess().getIterationClausesArrayConstructionIterationClauseParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArrayConstructionIterationClause_in_ruleArrayConstructionOperator10433);
                    lv_iterationClauses_5_0=ruleArrayConstructionIterationClause();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayConstructionOperatorRule());
                      	        }
                             		add(
                             			current, 
                             			"iterationClauses",
                              		lv_iterationClauses_5_0, 
                              		"ArrayConstructionIterationClause");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4753:2: (otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==16) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4753:4: otherlv_6= ',' ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleArrayConstructionOperator10446); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getArrayConstructionOperatorAccess().getCommaKeyword_2_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4757:1: ( (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4758:1: (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4758:1: (lv_iterationClauses_7_0= ruleArrayConstructionIterationClause )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4759:3: lv_iterationClauses_7_0= ruleArrayConstructionIterationClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayConstructionOperatorAccess().getIterationClausesArrayConstructionIterationClauseParserRuleCall_2_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArrayConstructionIterationClause_in_ruleArrayConstructionOperator10467);
                    	    lv_iterationClauses_7_0=ruleArrayConstructionIterationClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArrayConstructionOperatorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"iterationClauses",
                    	              		lv_iterationClauses_7_0, 
                    	              		"ArrayConstructionIterationClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleArrayConstructionOperator10483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getArrayConstructionOperatorAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayConstructionOperator"


    // $ANTLR start "entryRuleArrayConstructionIterationClause"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4787:1: entryRuleArrayConstructionIterationClause returns [EObject current=null] : iv_ruleArrayConstructionIterationClause= ruleArrayConstructionIterationClause EOF ;
    public final EObject entryRuleArrayConstructionIterationClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayConstructionIterationClause = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4788:2: (iv_ruleArrayConstructionIterationClause= ruleArrayConstructionIterationClause EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4789:2: iv_ruleArrayConstructionIterationClause= ruleArrayConstructionIterationClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayConstructionIterationClauseRule()); 
            }
            pushFollow(FOLLOW_ruleArrayConstructionIterationClause_in_entryRuleArrayConstructionIterationClause10519);
            iv_ruleArrayConstructionIterationClause=ruleArrayConstructionIterationClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayConstructionIterationClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayConstructionIterationClause10529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayConstructionIterationClause"


    // $ANTLR start "ruleArrayConstructionIterationClause"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4796:1: ruleArrayConstructionIterationClause returns [EObject current=null] : ( ( (lv_variableName_0_0= ruleValidID ) ) otherlv_1= 'in' ( (lv_collectionExpression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleArrayConstructionIterationClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_variableName_0_0 = null;

        EObject lv_collectionExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4799:28: ( ( ( (lv_variableName_0_0= ruleValidID ) ) otherlv_1= 'in' ( (lv_collectionExpression_2_0= ruleExpression ) ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4800:1: ( ( (lv_variableName_0_0= ruleValidID ) ) otherlv_1= 'in' ( (lv_collectionExpression_2_0= ruleExpression ) ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4800:1: ( ( (lv_variableName_0_0= ruleValidID ) ) otherlv_1= 'in' ( (lv_collectionExpression_2_0= ruleExpression ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4800:2: ( (lv_variableName_0_0= ruleValidID ) ) otherlv_1= 'in' ( (lv_collectionExpression_2_0= ruleExpression ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4800:2: ( (lv_variableName_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4801:1: (lv_variableName_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4801:1: (lv_variableName_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4802:3: lv_variableName_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayConstructionIterationClauseAccess().getVariableNameValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleArrayConstructionIterationClause10575);
            lv_variableName_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayConstructionIterationClauseRule());
              	        }
                     		set(
                     			current, 
                     			"variableName",
                      		lv_variableName_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleArrayConstructionIterationClause10587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayConstructionIterationClauseAccess().getInKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4822:1: ( (lv_collectionExpression_2_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4823:1: (lv_collectionExpression_2_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4823:1: (lv_collectionExpression_2_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4824:3: lv_collectionExpression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayConstructionIterationClauseAccess().getCollectionExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArrayConstructionIterationClause10608);
            lv_collectionExpression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayConstructionIterationClauseRule());
              	        }
                     		set(
                     			current, 
                     			"collectionExpression",
                      		lv_collectionExpression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayConstructionIterationClause"


    // $ANTLR start "entryRuleArrayConcatenationOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4848:1: entryRuleArrayConcatenationOperator returns [EObject current=null] : iv_ruleArrayConcatenationOperator= ruleArrayConcatenationOperator EOF ;
    public final EObject entryRuleArrayConcatenationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayConcatenationOperator = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4849:2: (iv_ruleArrayConcatenationOperator= ruleArrayConcatenationOperator EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4850:2: iv_ruleArrayConcatenationOperator= ruleArrayConcatenationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayConcatenationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleArrayConcatenationOperator_in_entryRuleArrayConcatenationOperator10644);
            iv_ruleArrayConcatenationOperator=ruleArrayConcatenationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayConcatenationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayConcatenationOperator10654); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayConcatenationOperator"


    // $ANTLR start "ruleArrayConcatenationOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4857:1: ruleArrayConcatenationOperator returns [EObject current=null] : (otherlv_0= '[' ( (lv_rows_1_0= ruleExpressionList ) ) (otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleArrayConcatenationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_rows_1_0 = null;

        EObject lv_rows_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4860:28: ( (otherlv_0= '[' ( (lv_rows_1_0= ruleExpressionList ) ) (otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) ) )* otherlv_4= ']' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4861:1: (otherlv_0= '[' ( (lv_rows_1_0= ruleExpressionList ) ) (otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) ) )* otherlv_4= ']' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4861:1: (otherlv_0= '[' ( (lv_rows_1_0= ruleExpressionList ) ) (otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) ) )* otherlv_4= ']' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4861:3: otherlv_0= '[' ( (lv_rows_1_0= ruleExpressionList ) ) (otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleArrayConcatenationOperator10691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayConcatenationOperatorAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4865:1: ( (lv_rows_1_0= ruleExpressionList ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4866:1: (lv_rows_1_0= ruleExpressionList )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4866:1: (lv_rows_1_0= ruleExpressionList )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4867:3: lv_rows_1_0= ruleExpressionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayConcatenationOperatorAccess().getRowsExpressionListParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpressionList_in_ruleArrayConcatenationOperator10712);
            lv_rows_1_0=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayConcatenationOperatorRule());
              	        }
                     		add(
                     			current, 
                     			"rows",
                      		lv_rows_1_0, 
                      		"ExpressionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4883:2: (otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==20) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4883:4: otherlv_2= ';' ( (lv_rows_3_0= ruleExpressionList ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleArrayConcatenationOperator10725); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayConcatenationOperatorAccess().getSemicolonKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4887:1: ( (lv_rows_3_0= ruleExpressionList ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4888:1: (lv_rows_3_0= ruleExpressionList )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4888:1: (lv_rows_3_0= ruleExpressionList )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4889:3: lv_rows_3_0= ruleExpressionList
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayConcatenationOperatorAccess().getRowsExpressionListParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpressionList_in_ruleArrayConcatenationOperator10746);
            	    lv_rows_3_0=ruleExpressionList();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayConcatenationOperatorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"rows",
            	              		lv_rows_3_0, 
            	              		"ExpressionList");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleArrayConcatenationOperator10760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayConcatenationOperatorAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArrayConcatenationOperator"


    // $ANTLR start "entryRuleExpressionList"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4917:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4918:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4919:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionListRule()); 
            }
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList10796);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList10806); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4926:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4929:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4930:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4930:1: ( ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4930:2: ( (lv_expressions_0_0= ruleExpression ) ) (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4930:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4931:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4931:1: (lv_expressions_0_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4932:3: lv_expressions_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList10852);
            lv_expressions_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4948:2: (otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==16) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4948:4: otherlv_1= ',' ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExpressionList10865); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpressionListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4952:1: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4953:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4953:1: (lv_expressions_2_0= ruleExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4954:3: lv_expressions_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList10886);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleUnitConstructionOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4978:1: entryRuleUnitConstructionOperator returns [EObject current=null] : iv_ruleUnitConstructionOperator= ruleUnitConstructionOperator EOF ;
    public final EObject entryRuleUnitConstructionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitConstructionOperator = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4979:2: (iv_ruleUnitConstructionOperator= ruleUnitConstructionOperator EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4980:2: iv_ruleUnitConstructionOperator= ruleUnitConstructionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitConstructionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleUnitConstructionOperator_in_entryRuleUnitConstructionOperator10924);
            iv_ruleUnitConstructionOperator=ruleUnitConstructionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitConstructionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitConstructionOperator10934); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitConstructionOperator"


    // $ANTLR start "ruleUnitConstructionOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4987:1: ruleUnitConstructionOperator returns [EObject current=null] : (otherlv_0= '$' otherlv_1= '(' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ')' ) ;
    public final EObject ruleUnitConstructionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_unit_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4990:28: ( (otherlv_0= '$' otherlv_1= '(' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ')' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4991:1: (otherlv_0= '$' otherlv_1= '(' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ')' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4991:1: (otherlv_0= '$' otherlv_1= '(' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ')' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4991:3: otherlv_0= '$' otherlv_1= '(' ( (lv_unit_2_0= ruleUnit ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleUnitConstructionOperator10971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getUnitConstructionOperatorAccess().getDollarSignKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleUnitConstructionOperator10983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUnitConstructionOperatorAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4999:1: ( (lv_unit_2_0= ruleUnit ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5000:1: (lv_unit_2_0= ruleUnit )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5000:1: (lv_unit_2_0= ruleUnit )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5001:3: lv_unit_2_0= ruleUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnitConstructionOperatorAccess().getUnitUnitParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnit_in_ruleUnitConstructionOperator11004);
            lv_unit_2_0=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnitConstructionOperatorRule());
              	        }
                     		set(
                     			current, 
                     			"unit",
                      		lv_unit_2_0, 
                      		"Unit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleUnitConstructionOperator11016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getUnitConstructionOperatorAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitConstructionOperator"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5029:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5030:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5031:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression11052);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression11062); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5038:1: ruleParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5041:28: ( (otherlv_0= '(' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= ')' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5042:1: (otherlv_0= '(' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= ')' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5042:1: (otherlv_0= '(' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= ')' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5042:3: otherlv_0= '(' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleParenthesizedExpression11099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5046:1: ( (lv_expressions_1_0= ruleExpression ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5047:1: (lv_expressions_1_0= ruleExpression )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5047:1: (lv_expressions_1_0= ruleExpression )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5048:3: lv_expressions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression11120);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5064:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==16) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5064:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleParenthesizedExpression11133); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getParenthesizedExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5068:1: ( (lv_expressions_3_0= ruleExpression ) )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5069:1: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5069:1: (lv_expressions_3_0= ruleExpression )
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5070:3: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression11154);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_3_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleParenthesizedExpression11168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleBeginExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5098:1: entryRuleBeginExpression returns [EObject current=null] : iv_ruleBeginExpression= ruleBeginExpression EOF ;
    public final EObject entryRuleBeginExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeginExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5099:2: (iv_ruleBeginExpression= ruleBeginExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5100:2: iv_ruleBeginExpression= ruleBeginExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBeginExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBeginExpression_in_entryRuleBeginExpression11204);
            iv_ruleBeginExpression=ruleBeginExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBeginExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeginExpression11214); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBeginExpression"


    // $ANTLR start "ruleBeginExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5107:1: ruleBeginExpression returns [EObject current=null] : ( () otherlv_1= 'begin' ) ;
    public final EObject ruleBeginExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5110:28: ( ( () otherlv_1= 'begin' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5111:1: ( () otherlv_1= 'begin' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5111:1: ( () otherlv_1= 'begin' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5111:2: () otherlv_1= 'begin'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5111:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5112:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBeginExpressionAccess().getBeginExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleBeginExpression11260); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBeginExpressionAccess().getBeginKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBeginExpression"


    // $ANTLR start "entryRuleEndExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5129:1: entryRuleEndExpression returns [EObject current=null] : iv_ruleEndExpression= ruleEndExpression EOF ;
    public final EObject entryRuleEndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndExpression = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5130:2: (iv_ruleEndExpression= ruleEndExpression EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5131:2: iv_ruleEndExpression= ruleEndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEndExpression_in_entryRuleEndExpression11296);
            iv_ruleEndExpression=ruleEndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndExpression11306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEndExpression"


    // $ANTLR start "ruleEndExpression"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5138:1: ruleEndExpression returns [EObject current=null] : ( () otherlv_1= 'end' ) ;
    public final EObject ruleEndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5141:28: ( ( () otherlv_1= 'end' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5142:1: ( () otherlv_1= 'end' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5142:1: ( () otherlv_1= 'end' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5142:2: () otherlv_1= 'end'
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5142:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEndExpressionAccess().getEndExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleEndExpression11352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEndExpressionAccess().getEndKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEndExpression"


    // $ANTLR start "entryRuleUnit"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5160:1: entryRuleUnit returns [EObject current=null] : iv_ruleUnit= ruleUnit EOF ;
    public final EObject entryRuleUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnit = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5161:2: (iv_ruleUnit= ruleUnit EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5162:2: iv_ruleUnit= ruleUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitRule()); 
            }
            pushFollow(FOLLOW_ruleUnit_in_entryRuleUnit11388);
            iv_ruleUnit=ruleUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnit11398); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnit"


    // $ANTLR start "ruleUnit"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5169:1: ruleUnit returns [EObject current=null] : ( () ( ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )? )? ) ;
    public final EObject ruleUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_numerator_1_0 = null;

        EObject lv_denominator_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5172:28: ( ( () ( ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )? )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5173:1: ( () ( ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )? )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5173:1: ( () ( ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )? )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5173:2: () ( ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )? )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5173:2: ()
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5174:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getUnitAccess().getUnitAction_0(),
                          current);
                  
            }

            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5179:2: ( ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )? )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID||(LA81_0>=RULE_N && LA81_0<=RULE_ONE)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5179:3: ( (lv_numerator_1_0= ruleUnitNumerator ) ) (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )?
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5179:3: ( (lv_numerator_1_0= ruleUnitNumerator ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5180:1: (lv_numerator_1_0= ruleUnitNumerator )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5180:1: (lv_numerator_1_0= ruleUnitNumerator )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5181:3: lv_numerator_1_0= ruleUnitNumerator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitAccess().getNumeratorUnitNumeratorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnitNumerator_in_ruleUnit11454);
                    lv_numerator_1_0=ruleUnitNumerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"numerator",
                              		lv_numerator_1_0, 
                              		"UnitNumerator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5197:2: (otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==64) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5197:4: otherlv_2= '/' ( (lv_denominator_3_0= ruleUnitDenominator ) )
                            {
                            otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleUnit11467); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getUnitAccess().getSolidusKeyword_1_1_0());
                                  
                            }
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5201:1: ( (lv_denominator_3_0= ruleUnitDenominator ) )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5202:1: (lv_denominator_3_0= ruleUnitDenominator )
                            {
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5202:1: (lv_denominator_3_0= ruleUnitDenominator )
                            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5203:3: lv_denominator_3_0= ruleUnitDenominator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getUnitAccess().getDenominatorUnitDenominatorParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleUnitDenominator_in_ruleUnit11488);
                            lv_denominator_3_0=ruleUnitDenominator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getUnitRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"denominator",
                                      		lv_denominator_3_0, 
                                      		"UnitDenominator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnit"


    // $ANTLR start "entryRuleUnitNumerator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5227:1: entryRuleUnitNumerator returns [EObject current=null] : iv_ruleUnitNumerator= ruleUnitNumerator EOF ;
    public final EObject entryRuleUnitNumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitNumerator = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5228:2: (iv_ruleUnitNumerator= ruleUnitNumerator EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5229:2: iv_ruleUnitNumerator= ruleUnitNumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitNumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleUnitNumerator_in_entryRuleUnitNumerator11528);
            iv_ruleUnitNumerator=ruleUnitNumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitNumerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitNumerator11538); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitNumerator"


    // $ANTLR start "ruleUnitNumerator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5236:1: ruleUnitNumerator returns [EObject current=null] : ( ( () this_ONE_1= RULE_ONE ) | ( ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* ) ) ;
    public final EObject ruleUnitNumerator() throws RecognitionException {
        EObject current = null;

        Token this_ONE_1=null;
        Token otherlv_3=null;
        EObject lv_factors_2_0 = null;

        EObject lv_factors_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5239:28: ( ( ( () this_ONE_1= RULE_ONE ) | ( ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5240:1: ( ( () this_ONE_1= RULE_ONE ) | ( ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5240:1: ( ( () this_ONE_1= RULE_ONE ) | ( ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ONE) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ID||LA83_0==RULE_N) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5240:2: ( () this_ONE_1= RULE_ONE )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5240:2: ( () this_ONE_1= RULE_ONE )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5240:3: () this_ONE_1= RULE_ONE
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5240:3: ()
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5241:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getUnitNumeratorAccess().getUnitNumeratorAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_ONE_1=(Token)match(input,RULE_ONE,FOLLOW_RULE_ONE_in_ruleUnitNumerator11584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_1, grammarAccess.getUnitNumeratorAccess().getONETerminalRuleCall_0_1()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5251:6: ( ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5251:6: ( ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5251:7: ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )*
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5251:7: ( (lv_factors_2_0= ruleUnitFactor ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5252:1: (lv_factors_2_0= ruleUnitFactor )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5252:1: (lv_factors_2_0= ruleUnitFactor )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5253:3: lv_factors_2_0= ruleUnitFactor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitNumeratorAccess().getFactorsUnitFactorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnitFactor_in_ruleUnitNumerator11612);
                    lv_factors_2_0=ruleUnitFactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitNumeratorRule());
                      	        }
                             		add(
                             			current, 
                             			"factors",
                              		lv_factors_2_0, 
                              		"UnitFactor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5269:2: (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==65) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5269:4: otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) )
                    	    {
                    	    otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleUnitNumerator11625); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getUnitNumeratorAccess().getAsteriskKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5273:1: ( (lv_factors_4_0= ruleUnitFactor ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5274:1: (lv_factors_4_0= ruleUnitFactor )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5274:1: (lv_factors_4_0= ruleUnitFactor )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5275:3: lv_factors_4_0= ruleUnitFactor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUnitNumeratorAccess().getFactorsUnitFactorParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleUnitFactor_in_ruleUnitNumerator11646);
                    	    lv_factors_4_0=ruleUnitFactor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUnitNumeratorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"factors",
                    	              		lv_factors_4_0, 
                    	              		"UnitFactor");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitNumerator"


    // $ANTLR start "entryRuleUnitDenominator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5299:1: entryRuleUnitDenominator returns [EObject current=null] : iv_ruleUnitDenominator= ruleUnitDenominator EOF ;
    public final EObject entryRuleUnitDenominator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitDenominator = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5300:2: (iv_ruleUnitDenominator= ruleUnitDenominator EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5301:2: iv_ruleUnitDenominator= ruleUnitDenominator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitDenominatorRule()); 
            }
            pushFollow(FOLLOW_ruleUnitDenominator_in_entryRuleUnitDenominator11685);
            iv_ruleUnitDenominator=ruleUnitDenominator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitDenominator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitDenominator11695); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitDenominator"


    // $ANTLR start "ruleUnitDenominator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5308:1: ruleUnitDenominator returns [EObject current=null] : ( ( (lv_factors_0_0= ruleUnitFactor ) ) | (otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleUnitDenominator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_factors_0_0 = null;

        EObject lv_factors_2_0 = null;

        EObject lv_factors_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5311:28: ( ( ( (lv_factors_0_0= ruleUnitFactor ) ) | (otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5312:1: ( ( (lv_factors_0_0= ruleUnitFactor ) ) | (otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5312:1: ( ( (lv_factors_0_0= ruleUnitFactor ) ) | (otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')' ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_ID||LA85_0==RULE_N) ) {
                alt85=1;
            }
            else if ( (LA85_0==27) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5312:2: ( (lv_factors_0_0= ruleUnitFactor ) )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5312:2: ( (lv_factors_0_0= ruleUnitFactor ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5313:1: (lv_factors_0_0= ruleUnitFactor )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5313:1: (lv_factors_0_0= ruleUnitFactor )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5314:3: lv_factors_0_0= ruleUnitFactor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitDenominatorAccess().getFactorsUnitFactorParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnitFactor_in_ruleUnitDenominator11741);
                    lv_factors_0_0=ruleUnitFactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitDenominatorRule());
                      	        }
                             		add(
                             			current, 
                             			"factors",
                              		lv_factors_0_0, 
                              		"UnitFactor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5331:6: (otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5331:6: (otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5331:8: otherlv_1= '(' ( (lv_factors_2_0= ruleUnitFactor ) ) (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleUnitDenominator11760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUnitDenominatorAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5335:1: ( (lv_factors_2_0= ruleUnitFactor ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5336:1: (lv_factors_2_0= ruleUnitFactor )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5336:1: (lv_factors_2_0= ruleUnitFactor )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5337:3: lv_factors_2_0= ruleUnitFactor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitDenominatorAccess().getFactorsUnitFactorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnitFactor_in_ruleUnitDenominator11781);
                    lv_factors_2_0=ruleUnitFactor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitDenominatorRule());
                      	        }
                             		add(
                             			current, 
                             			"factors",
                              		lv_factors_2_0, 
                              		"UnitFactor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5353:2: (otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==65) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5353:4: otherlv_3= '*' ( (lv_factors_4_0= ruleUnitFactor ) )
                    	    {
                    	    otherlv_3=(Token)match(input,65,FOLLOW_65_in_ruleUnitDenominator11794); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getUnitDenominatorAccess().getAsteriskKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5357:1: ( (lv_factors_4_0= ruleUnitFactor ) )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5358:1: (lv_factors_4_0= ruleUnitFactor )
                    	    {
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5358:1: (lv_factors_4_0= ruleUnitFactor )
                    	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5359:3: lv_factors_4_0= ruleUnitFactor
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUnitDenominatorAccess().getFactorsUnitFactorParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleUnitFactor_in_ruleUnitDenominator11815);
                    	    lv_factors_4_0=ruleUnitFactor();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUnitDenominatorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"factors",
                    	              		lv_factors_4_0, 
                    	              		"UnitFactor");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleUnitDenominator11829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getUnitDenominatorAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitDenominator"


    // $ANTLR start "entryRuleUnitFactor"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5387:1: entryRuleUnitFactor returns [EObject current=null] : iv_ruleUnitFactor= ruleUnitFactor EOF ;
    public final EObject entryRuleUnitFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnitFactor = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5388:2: (iv_ruleUnitFactor= ruleUnitFactor EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5389:2: iv_ruleUnitFactor= ruleUnitFactor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitFactorRule()); 
            }
            pushFollow(FOLLOW_ruleUnitFactor_in_entryRuleUnitFactor11866);
            iv_ruleUnitFactor=ruleUnitFactor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitFactor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitFactor11876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitFactor"


    // $ANTLR start "ruleUnitFactor"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5396:1: ruleUnitFactor returns [EObject current=null] : ( ( (lv_symbol_0_0= ruleValidID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) ) )? ) ;
    public final EObject ruleUnitFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_symbol_0_0 = null;

        AntlrDatatypeRuleToken lv_exponent_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5399:28: ( ( ( (lv_symbol_0_0= ruleValidID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) ) )? ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5400:1: ( ( (lv_symbol_0_0= ruleValidID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) ) )? )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5400:1: ( ( (lv_symbol_0_0= ruleValidID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) ) )? )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5400:2: ( (lv_symbol_0_0= ruleValidID ) ) (otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) ) )?
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5400:2: ( (lv_symbol_0_0= ruleValidID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5401:1: (lv_symbol_0_0= ruleValidID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5401:1: (lv_symbol_0_0= ruleValidID )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5402:3: lv_symbol_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnitFactorAccess().getSymbolValidIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleUnitFactor11922);
            lv_symbol_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnitFactorRule());
              	        }
                     		set(
                     			current, 
                     			"symbol",
                      		lv_symbol_0_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5418:2: (otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==66) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5418:4: otherlv_1= '^' ( (lv_exponent_2_0= ruleUnitExponent ) )
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleUnitFactor11935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getUnitFactorAccess().getCircumflexAccentKeyword_1_0());
                          
                    }
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5422:1: ( (lv_exponent_2_0= ruleUnitExponent ) )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5423:1: (lv_exponent_2_0= ruleUnitExponent )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5423:1: (lv_exponent_2_0= ruleUnitExponent )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5424:3: lv_exponent_2_0= ruleUnitExponent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnitFactorAccess().getExponentUnitExponentParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleUnitExponent_in_ruleUnitFactor11956);
                    lv_exponent_2_0=ruleUnitExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnitFactorRule());
                      	        }
                             		set(
                             			current, 
                             			"exponent",
                              		lv_exponent_2_0, 
                              		"UnitExponent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitFactor"


    // $ANTLR start "entryRuleUnitExponent"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5448:1: entryRuleUnitExponent returns [String current=null] : iv_ruleUnitExponent= ruleUnitExponent EOF ;
    public final String entryRuleUnitExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnitExponent = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5449:2: (iv_ruleUnitExponent= ruleUnitExponent EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5450:2: iv_ruleUnitExponent= ruleUnitExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnitExponentRule()); 
            }
            pushFollow(FOLLOW_ruleUnitExponent_in_entryRuleUnitExponent11995);
            iv_ruleUnitExponent=ruleUnitExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnitExponent.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnitExponent12006); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnitExponent"


    // $ANTLR start "ruleUnitExponent"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5457:1: ruleUnitExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_ValidInt_1= ruleValidInt ) ;
    public final AntlrDatatypeRuleToken ruleUnitExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidInt_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5460:28: ( ( (kw= '-' )? this_ValidInt_1= ruleValidInt ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5461:1: ( (kw= '-' )? this_ValidInt_1= ruleValidInt )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5461:1: ( (kw= '-' )? this_ValidInt_1= ruleValidInt )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5461:2: (kw= '-' )? this_ValidInt_1= ruleValidInt
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5461:2: (kw= '-' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==59) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5462:2: kw= '-'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleUnitExponent12045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnitExponentAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUnitExponentAccess().getValidIntParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleValidInt_in_ruleUnitExponent12069);
            this_ValidInt_1=ruleValidInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidInt_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnitExponent"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5486:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5487:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5488:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12115);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12126); if (state.failed) return current;

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
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5495:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5498:28: ( (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5499:1: (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5499:1: (this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )* )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5500:5: this_ValidID_0= ruleValidID (kw= '::' this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName12173);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5510:1: (kw= '::' this_ValidID_2= ruleValidID )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==67) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5511:2: kw= '::' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleQualifiedName12192); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName12214);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidDouble"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5535:1: entryRuleValidDouble returns [String current=null] : iv_ruleValidDouble= ruleValidDouble EOF ;
    public final String entryRuleValidDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidDouble = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5536:2: (iv_ruleValidDouble= ruleValidDouble EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5537:2: iv_ruleValidDouble= ruleValidDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidDoubleRule()); 
            }
            pushFollow(FOLLOW_ruleValidDouble_in_entryRuleValidDouble12262);
            iv_ruleValidDouble=ruleValidDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidDouble.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidDouble12273); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidDouble"


    // $ANTLR start "ruleValidDouble"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5544:1: ruleValidDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REAL_0= RULE_REAL ;
    public final AntlrDatatypeRuleToken ruleValidDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REAL_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5547:28: (this_REAL_0= RULE_REAL )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5548:5: this_REAL_0= RULE_REAL
            {
            this_REAL_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleValidDouble12312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_REAL_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_REAL_0, grammarAccess.getValidDoubleAccess().getREALTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidDouble"


    // $ANTLR start "entryRuleValidInt"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5563:1: entryRuleValidInt returns [String current=null] : iv_ruleValidInt= ruleValidInt EOF ;
    public final String entryRuleValidInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidInt = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5564:2: (iv_ruleValidInt= ruleValidInt EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5565:2: iv_ruleValidInt= ruleValidInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIntRule()); 
            }
            pushFollow(FOLLOW_ruleValidInt_in_entryRuleValidInt12357);
            iv_ruleValidInt=ruleValidInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidInt.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidInt12368); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidInt"


    // $ANTLR start "ruleValidInt"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5572:1: ruleValidInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleValidInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ONE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5575:28: ( (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5576:1: (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5576:1: (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ONE) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_INT) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5576:6: this_ONE_0= RULE_ONE
                    {
                    this_ONE_0=(Token)match(input,RULE_ONE,FOLLOW_RULE_ONE_in_ruleValidInt12408); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_0, grammarAccess.getValidIntAccess().getONETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5584:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValidInt12434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getValidIntAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidInt"


    // $ANTLR start "entryRuleValidLong"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5599:1: entryRuleValidLong returns [String current=null] : iv_ruleValidLong= ruleValidLong EOF ;
    public final String entryRuleValidLong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidLong = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5600:2: (iv_ruleValidLong= ruleValidLong EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5601:2: iv_ruleValidLong= ruleValidLong EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidLongRule()); 
            }
            pushFollow(FOLLOW_ruleValidLong_in_entryRuleValidLong12480);
            iv_ruleValidLong=ruleValidLong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidLong.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidLong12491); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidLong"


    // $ANTLR start "ruleValidLong"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5608:1: ruleValidLong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleValidLong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ONE_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5611:28: ( (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5612:1: (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5612:1: (this_ONE_0= RULE_ONE | this_INT_1= RULE_INT )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ONE) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_INT) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5612:6: this_ONE_0= RULE_ONE
                    {
                    this_ONE_0=(Token)match(input,RULE_ONE,FOLLOW_RULE_ONE_in_ruleValidLong12531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ONE_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ONE_0, grammarAccess.getValidLongAccess().getONETerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5620:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValidLong12557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getValidLongAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidLong"


    // $ANTLR start "entryRuleValidID"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5635:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5636:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5637:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID12603);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID12614); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5644:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_N_0= RULE_N | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_N_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5647:28: ( (this_N_0= RULE_N | this_ID_1= RULE_ID ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5648:1: (this_N_0= RULE_N | this_ID_1= RULE_ID )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5648:1: (this_N_0= RULE_N | this_ID_1= RULE_ID )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_N) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_ID) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5648:6: this_N_0= RULE_N
                    {
                    this_N_0=(Token)match(input,RULE_N,FOLLOW_RULE_N_in_ruleValidID12654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_N_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_N_0, grammarAccess.getValidIDAccess().getNTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5656:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID12680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "ruleAssertionStatusKind"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5671:1: ruleAssertionStatusKind returns [Enumerator current=null] : ( (enumLiteral_0= 'info' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'fatal' ) ) ;
    public final Enumerator ruleAssertionStatusKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5673:28: ( ( (enumLiteral_0= 'info' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'fatal' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5674:1: ( (enumLiteral_0= 'info' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'fatal' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5674:1: ( (enumLiteral_0= 'info' ) | (enumLiteral_1= 'warning' ) | (enumLiteral_2= 'error' ) | (enumLiteral_3= 'fatal' ) )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt92=1;
                }
                break;
            case 69:
                {
                alt92=2;
                }
                break;
            case 70:
                {
                alt92=3;
                }
                break;
            case 71:
                {
                alt92=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5674:2: (enumLiteral_0= 'info' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5674:2: (enumLiteral_0= 'info' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5674:4: enumLiteral_0= 'info'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_68_in_ruleAssertionStatusKind12739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssertionStatusKindAccess().getInfoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAssertionStatusKindAccess().getInfoEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5680:6: (enumLiteral_1= 'warning' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5680:6: (enumLiteral_1= 'warning' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5680:8: enumLiteral_1= 'warning'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_69_in_ruleAssertionStatusKind12756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssertionStatusKindAccess().getWarningEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAssertionStatusKindAccess().getWarningEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5686:6: (enumLiteral_2= 'error' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5686:6: (enumLiteral_2= 'error' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5686:8: enumLiteral_2= 'error'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_70_in_ruleAssertionStatusKind12773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssertionStatusKindAccess().getErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAssertionStatusKindAccess().getErrorEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5692:6: (enumLiteral_3= 'fatal' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5692:6: (enumLiteral_3= 'fatal' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5692:8: enumLiteral_3= 'fatal'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_71_in_ruleAssertionStatusKind12790); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAssertionStatusKindAccess().getFatalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAssertionStatusKindAccess().getFatalEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssertionStatusKind"


    // $ANTLR start "ruleEqualityOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5702:1: ruleEqualityOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) ;
    public final Enumerator ruleEqualityOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5704:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5705:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5705:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==72) ) {
                alt93=1;
            }
            else if ( (LA93_0==73) ) {
                alt93=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5705:2: (enumLiteral_0= '==' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5705:2: (enumLiteral_0= '==' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5705:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_72_in_ruleEqualityOperator12835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEqualityOperatorAccess().getEqualToEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEqualityOperatorAccess().getEqualToEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5711:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5711:6: (enumLiteral_1= '!=' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5711:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_73_in_ruleEqualityOperator12852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEqualityOperatorAccess().getNotEqualToEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEqualityOperatorAccess().getNotEqualToEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "ruleRelationalOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5721:1: ruleRelationalOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleRelationalOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5723:28: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5724:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5724:1: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '<=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '>=' ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt94=1;
                }
                break;
            case 74:
                {
                alt94=2;
                }
                break;
            case 26:
                {
                alt94=3;
                }
                break;
            case 75:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5724:2: (enumLiteral_0= '<' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5724:2: (enumLiteral_0= '<' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5724:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleRelationalOperator12897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getLessThanEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationalOperatorAccess().getLessThanEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5730:6: (enumLiteral_1= '<=' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5730:6: (enumLiteral_1= '<=' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5730:8: enumLiteral_1= '<='
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleRelationalOperator12914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getLessThanOrEqualToEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationalOperatorAccess().getLessThanOrEqualToEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5736:6: (enumLiteral_2= '>' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5736:6: (enumLiteral_2= '>' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5736:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleRelationalOperator12931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterThanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationalOperatorAccess().getGreaterThanEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5742:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5742:6: (enumLiteral_3= '>=' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5742:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_75_in_ruleRelationalOperator12948); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationalOperatorAccess().getGreaterThanOrEqualToEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationalOperatorAccess().getGreaterThanOrEqualToEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5752:1: ruleAdditiveOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAdditiveOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5754:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5755:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5755:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==76) ) {
                alt95=1;
            }
            else if ( (LA95_0==59) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5755:2: (enumLiteral_0= '+' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5755:2: (enumLiteral_0= '+' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5755:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_76_in_ruleAdditiveOperator12993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getAddEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAdditiveOperatorAccess().getAddEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5761:6: (enumLiteral_1= '-' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5761:6: (enumLiteral_1= '-' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5761:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_59_in_ruleAdditiveOperator13010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAdditiveOperatorAccess().getSubtractEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAdditiveOperatorAccess().getSubtractEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5771:1: ruleMultiplicativeOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '.*' ) | (enumLiteral_3= './' ) ) ;
    public final Enumerator ruleMultiplicativeOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5773:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '.*' ) | (enumLiteral_3= './' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5774:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '.*' ) | (enumLiteral_3= './' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5774:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= '.*' ) | (enumLiteral_3= './' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt96=1;
                }
                break;
            case 64:
                {
                alt96=2;
                }
                break;
            case 77:
                {
                alt96=3;
                }
                break;
            case 78:
                {
                alt96=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5774:2: (enumLiteral_0= '*' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5774:2: (enumLiteral_0= '*' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5774:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleMultiplicativeOperator13055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getMultiplyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getMultiplicativeOperatorAccess().getMultiplyEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5780:6: (enumLiteral_1= '/' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5780:6: (enumLiteral_1= '/' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5780:8: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleMultiplicativeOperator13072); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getDivideEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getMultiplicativeOperatorAccess().getDivideEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5786:6: (enumLiteral_2= '.*' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5786:6: (enumLiteral_2= '.*' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5786:8: enumLiteral_2= '.*'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleMultiplicativeOperator13089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getElementWiseMultiplyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getMultiplicativeOperatorAccess().getElementWiseMultiplyEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5792:6: (enumLiteral_3= './' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5792:6: (enumLiteral_3= './' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5792:8: enumLiteral_3= './'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleMultiplicativeOperator13106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getMultiplicativeOperatorAccess().getElementWiseDivideEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getMultiplicativeOperatorAccess().getElementWiseDivideEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "rulePowerOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5802:1: rulePowerOperator returns [Enumerator current=null] : ( (enumLiteral_0= '^' ) | (enumLiteral_1= '.^' ) ) ;
    public final Enumerator rulePowerOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5804:28: ( ( (enumLiteral_0= '^' ) | (enumLiteral_1= '.^' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5805:1: ( (enumLiteral_0= '^' ) | (enumLiteral_1= '.^' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5805:1: ( (enumLiteral_0= '^' ) | (enumLiteral_1= '.^' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==66) ) {
                alt97=1;
            }
            else if ( (LA97_0==79) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5805:2: (enumLiteral_0= '^' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5805:2: (enumLiteral_0= '^' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5805:4: enumLiteral_0= '^'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_rulePowerOperator13151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPowerOperatorAccess().getPowerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getPowerOperatorAccess().getPowerEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5811:6: (enumLiteral_1= '.^' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5811:6: (enumLiteral_1= '.^' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5811:8: enumLiteral_1= '.^'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_79_in_rulePowerOperator13168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getPowerOperatorAccess().getElementWisePowerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getPowerOperatorAccess().getElementWisePowerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePowerOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5821:1: ruleUnaryOperator returns [Enumerator current=null] : ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5823:28: ( ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5824:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5824:1: ( (enumLiteral_0= '-' ) | (enumLiteral_1= '!' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==59) ) {
                alt98=1;
            }
            else if ( (LA98_0==80) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5824:2: (enumLiteral_0= '-' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5824:2: (enumLiteral_0= '-' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5824:4: enumLiteral_0= '-'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleUnaryOperator13213); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getNegateEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNegateEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5830:6: (enumLiteral_1= '!' )
                    {
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5830:6: (enumLiteral_1= '!' )
                    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5830:8: enumLiteral_1= '!'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleUnaryOperator13230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getUnaryOperatorAccess().getLogicalNotEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "rulePostfixOperator"
    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5840:1: rulePostfixOperator returns [Enumerator current=null] : (enumLiteral_0= '\\'' ) ;
    public final Enumerator rulePostfixOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5842:28: ( (enumLiteral_0= '\\'' ) )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5843:1: (enumLiteral_0= '\\'' )
            {
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5843:1: (enumLiteral_0= '\\'' )
            // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:5843:3: enumLiteral_0= '\\''
            {
            enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_rulePostfixOperator13274); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getPostfixOperatorAccess().getTransposeEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getPostfixOperatorAccess().getTransposeEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePostfixOperator"

    // $ANTLR start synpred1_InternalMscript
    public final void synpred1_InternalMscript_fragment() throws RecognitionException {   
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:8: ( ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) ) )
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:9: ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) )
        {
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:9: ( ( ( rulePrimitiveType ) ) | ( ( RULE_ID ) ) )
        int alt99=2;
        int LA99_0 = input.LA(1);

        if ( ((LA99_0>=34 && LA99_0<=39)) ) {
            alt99=1;
        }
        else if ( (LA99_0==RULE_ID) ) {
            alt99=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 99, 0, input);

            throw nvae;
        }
        switch (alt99) {
            case 1 :
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:10: ( ( rulePrimitiveType ) )
                {
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1672:10: ( ( rulePrimitiveType ) )
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1673:1: ( rulePrimitiveType )
                {
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1673:1: ( rulePrimitiveType )
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1674:1: rulePrimitiveType
                {
                pushFollow(FOLLOW_rulePrimitiveType_in_synpred1_InternalMscript3711);
                rulePrimitiveType();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1677:6: ( ( RULE_ID ) )
                {
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1677:6: ( ( RULE_ID ) )
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1678:1: ( RULE_ID )
                {
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1678:1: ( RULE_ID )
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:1679:2: RULE_ID
                {
                match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred1_InternalMscript3727); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_InternalMscript

    // $ANTLR start synpred2_InternalMscript
    public final void synpred2_InternalMscript_fragment() throws RecognitionException {   
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:7: ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:8: ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' )
        {
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:8: ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' )
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:9: () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')'
        {
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4251:9: ()
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4252:1: 
        {
        }

        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4252:2: ( ( ruleQualifiedName ) )
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4253:1: ( ruleQualifiedName )
        {
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4253:1: ( ruleQualifiedName )
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4254:3: ruleQualifiedName
        {
        pushFollow(FOLLOW_ruleQualifiedName_in_synpred2_InternalMscript9284);
        ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_27_in_synpred2_InternalMscript9290); if (state.failed) return ;
        // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4257:1: ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )?
        int alt101=2;
        int LA101_0 = input.LA(1);

        if ( ((LA101_0>=RULE_ID && LA101_0<=RULE_INT)||LA101_0==15||LA101_0==27||LA101_0==30||LA101_0==40||LA101_0==42||LA101_0==44||LA101_0==47||(LA101_0>=56 && LA101_0<=57)||LA101_0==59||(LA101_0>=61 && LA101_0<=63)||LA101_0==80) ) {
            alt101=1;
        }
        switch (alt101) {
            case 1 :
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4257:2: ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )*
                {
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4257:2: ( ( ruleExpression ) )
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4258:1: ( ruleExpression )
                {
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4258:1: ( ruleExpression )
                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4259:1: ruleExpression
                {
                pushFollow(FOLLOW_ruleExpression_in_synpred2_InternalMscript9298);
                ruleExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4261:2: ( ',' ( ( ruleExpression ) ) )*
                loop100:
                do {
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==16) ) {
                        alt100=1;
                    }


                    switch (alt100) {
                	case 1 :
                	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4261:4: ',' ( ( ruleExpression ) )
                	    {
                	    match(input,16,FOLLOW_16_in_synpred2_InternalMscript9305); if (state.failed) return ;
                	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4262:1: ( ( ruleExpression ) )
                	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4263:1: ( ruleExpression )
                	    {
                	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4263:1: ( ruleExpression )
                	    // ../org.eclipselabs.mscript.language/src-gen/org/eclipselabs/mscript/language/parser/antlr/internal/InternalMscript.g:4264:1: ruleExpression
                	    {
                	    pushFollow(FOLLOW_ruleExpression_in_synpred2_InternalMscript9312);
                	    ruleExpression();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop100;
                    }
                } while (true);


                }
                break;

        }

        match(input,28,FOLLOW_28_in_synpred2_InternalMscript9322); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalMscript

    // Delegated rules

    public final boolean synpred1_InternalMscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMscript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMscript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String DFA17_eotS =
        "\u00a1\uffff";
    static final String DFA17_eofS =
        "\1\uffff\6\11\11\uffff\1\11\3\uffff\1\11\3\uffff\1\11\3\uffff\1"+
        "\11\u0084\uffff";
    static final String DFA17_minS =
        "\1\4\6\20\1\uffff\1\4\1\uffff\3\4\3\34\1\20\3\34\1\20\3\34\1\20"+
        "\3\34\1\20\1\4\1\7\2\4\1\7\2\4\1\7\2\4\1\7\1\4\2\34\1\4\1\7\6\34"+
        "\1\4\1\7\6\34\1\4\1\7\6\34\1\4\1\7\4\34\1\7\2\34\2\7\2\34\2\7\2"+
        "\34\2\7\2\34\2\7\2\34\1\7\1\4\1\34\1\7\2\34\1\7\2\34\1\7\1\4\1\34"+
        "\1\7\2\34\1\7\2\34\1\7\1\4\1\34\1\7\2\34\1\7\2\34\1\7\1\4\1\34\1"+
        "\7\2\34\1\7\4\34\1\7\4\34\1\7\4\34\1\7\4\34\5\7\2\34\1\7\2\34\1"+
        "\7\2\34\1\7\2\34";
    static final String DFA17_maxS =
        "\1\47\6\111\1\uffff\1\34\1\uffff\3\34\1\100\2\102\1\111\1\100\2"+
        "\102\1\111\1\100\2\102\1\111\1\100\2\102\1\111\1\33\1\73\1\6\1\33"+
        "\1\73\1\6\1\33\1\73\1\6\1\33\1\73\1\6\2\102\1\6\1\11\2\101\4\102"+
        "\1\6\1\11\2\101\4\102\1\6\1\11\2\101\4\102\1\6\1\11\2\101\2\102"+
        "\1\73\2\102\2\73\2\102\2\73\2\102\2\73\2\102\1\73\1\11\2\34\1\73"+
        "\1\6\1\34\1\11\2\101\1\11\2\34\1\73\1\6\1\34\1\11\2\101\1\11\2\34"+
        "\1\73\1\6\1\34\1\11\2\101\1\11\2\34\1\73\1\6\1\34\1\11\2\101\1\11"+
        "\2\101\2\102\1\11\2\101\2\102\1\11\2\101\2\102\1\11\2\101\2\102"+
        "\4\73\1\11\2\101\1\11\2\101\1\11\2\101\1\11\2\101";
    static final String DFA17_acceptS =
        "\7\uffff\1\2\1\uffff\1\1\u0097\uffff";
    static final String DFA17_specialS =
        "\u00a1\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\7\35\uffff\1\1\1\2\1\3\1\4\1\5\1\6",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\10\1\11\13\uffff"+
            "\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff\1\11"+
            "\4\uffff\1\11\13\uffff\2\11",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\12\1\11\13\uffff"+
            "\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff\1\11"+
            "\4\uffff\1\11\13\uffff\2\11",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\13\1\11\13\uffff"+
            "\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff\1\11"+
            "\4\uffff\1\11\13\uffff\2\11",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\14\1\11\13\uffff"+
            "\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff\1\11"+
            "\4\uffff\1\11\13\uffff\2\11",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\13"+
            "\uffff\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff"+
            "\1\11\4\uffff\1\11\13\uffff\2\11",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\13"+
            "\uffff\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff"+
            "\1\11\4\uffff\1\11\13\uffff\2\11",
            "",
            "\1\17\1\uffff\1\16\1\15\24\uffff\1\20",
            "",
            "\1\23\1\uffff\1\22\1\21\24\uffff\1\24",
            "\1\27\1\uffff\1\26\1\25\24\uffff\1\30",
            "\1\33\1\uffff\1\32\1\31\24\uffff\1\34",
            "\1\20\43\uffff\1\35",
            "\1\20\43\uffff\1\35\1\37\1\36",
            "\1\20\43\uffff\1\35\1\37\1\36",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\13"+
            "\uffff\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff"+
            "\1\11\4\uffff\1\11\13\uffff\2\11",
            "\1\24\43\uffff\1\40",
            "\1\24\43\uffff\1\40\1\42\1\41",
            "\1\24\43\uffff\1\40\1\42\1\41",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\13"+
            "\uffff\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff"+
            "\1\11\4\uffff\1\11\13\uffff\2\11",
            "\1\30\43\uffff\1\43",
            "\1\30\43\uffff\1\43\1\45\1\44",
            "\1\30\43\uffff\1\43\1\45\1\44",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\13"+
            "\uffff\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff"+
            "\1\11\4\uffff\1\11\13\uffff\2\11",
            "\1\34\43\uffff\1\46",
            "\1\34\43\uffff\1\46\1\50\1\47",
            "\1\34\43\uffff\1\46\1\50\1\47",
            "\2\11\1\uffff\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1\11\13"+
            "\uffff\1\7\1\11\1\uffff\1\11\1\uffff\2\11\1\uffff\5\11\2\uffff"+
            "\1\11\4\uffff\1\11\13\uffff\2\11",
            "\1\52\1\uffff\1\51\24\uffff\1\53",
            "\1\55\1\uffff\1\56\61\uffff\1\54",
            "\1\60\1\uffff\1\57",
            "\1\62\1\uffff\1\61\24\uffff\1\63",
            "\1\65\1\uffff\1\66\61\uffff\1\64",
            "\1\70\1\uffff\1\67",
            "\1\72\1\uffff\1\71\24\uffff\1\73",
            "\1\75\1\uffff\1\76\61\uffff\1\74",
            "\1\100\1\uffff\1\77",
            "\1\102\1\uffff\1\101\24\uffff\1\103",
            "\1\105\1\uffff\1\106\61\uffff\1\104",
            "\1\110\1\uffff\1\107",
            "\1\20\45\uffff\1\111",
            "\1\20\45\uffff\1\111",
            "\1\113\1\uffff\1\112",
            "\1\55\1\uffff\1\56",
            "\1\20\43\uffff\1\35\1\37",
            "\1\20\43\uffff\1\35\1\37",
            "\1\20\43\uffff\1\35\1\37\1\114",
            "\1\20\43\uffff\1\35\1\37\1\114",
            "\1\24\45\uffff\1\115",
            "\1\24\45\uffff\1\115",
            "\1\117\1\uffff\1\116",
            "\1\65\1\uffff\1\66",
            "\1\24\43\uffff\1\40\1\42",
            "\1\24\43\uffff\1\40\1\42",
            "\1\24\43\uffff\1\40\1\42\1\120",
            "\1\24\43\uffff\1\40\1\42\1\120",
            "\1\30\45\uffff\1\121",
            "\1\30\45\uffff\1\121",
            "\1\123\1\uffff\1\122",
            "\1\75\1\uffff\1\76",
            "\1\30\43\uffff\1\43\1\45",
            "\1\30\43\uffff\1\43\1\45",
            "\1\30\43\uffff\1\43\1\45\1\124",
            "\1\30\43\uffff\1\43\1\45\1\124",
            "\1\34\45\uffff\1\125",
            "\1\34\45\uffff\1\125",
            "\1\127\1\uffff\1\126",
            "\1\105\1\uffff\1\106",
            "\1\34\43\uffff\1\46\1\50",
            "\1\34\43\uffff\1\46\1\50",
            "\1\34\43\uffff\1\46\1\50\1\130",
            "\1\34\43\uffff\1\46\1\50\1\130",
            "\1\132\1\uffff\1\133\61\uffff\1\131",
            "\1\136\44\uffff\1\135\1\134",
            "\1\136\44\uffff\1\135\1\134",
            "\1\140\1\uffff\1\141\61\uffff\1\137",
            "\1\143\1\uffff\1\144\61\uffff\1\142",
            "\1\147\44\uffff\1\146\1\145",
            "\1\147\44\uffff\1\146\1\145",
            "\1\151\1\uffff\1\152\61\uffff\1\150",
            "\1\154\1\uffff\1\155\61\uffff\1\153",
            "\1\160\44\uffff\1\157\1\156",
            "\1\160\44\uffff\1\157\1\156",
            "\1\162\1\uffff\1\163\61\uffff\1\161",
            "\1\165\1\uffff\1\166\61\uffff\1\164",
            "\1\171\44\uffff\1\170\1\167",
            "\1\171\44\uffff\1\170\1\167",
            "\1\173\1\uffff\1\174\61\uffff\1\172",
            "\1\132\1\uffff\1\133",
            "\1\20",
            "\1\20",
            "\1\176\1\uffff\1\177\61\uffff\1\175",
            "\1\u0081\1\uffff\1\u0080",
            "\1\20",
            "\1\140\1\uffff\1\141",
            "\1\20\43\uffff\1\35\1\37",
            "\1\20\43\uffff\1\35\1\37",
            "\1\143\1\uffff\1\144",
            "\1\24",
            "\1\24",
            "\1\u0083\1\uffff\1\u0084\61\uffff\1\u0082",
            "\1\u0086\1\uffff\1\u0085",
            "\1\24",
            "\1\151\1\uffff\1\152",
            "\1\24\43\uffff\1\40\1\42",
            "\1\24\43\uffff\1\40\1\42",
            "\1\154\1\uffff\1\155",
            "\1\30",
            "\1\30",
            "\1\u0088\1\uffff\1\u0089\61\uffff\1\u0087",
            "\1\u008b\1\uffff\1\u008a",
            "\1\30",
            "\1\162\1\uffff\1\163",
            "\1\30\43\uffff\1\43\1\45",
            "\1\30\43\uffff\1\43\1\45",
            "\1\165\1\uffff\1\166",
            "\1\34",
            "\1\34",
            "\1\u008d\1\uffff\1\u008e\61\uffff\1\u008c",
            "\1\u0090\1\uffff\1\u008f",
            "\1\34",
            "\1\173\1\uffff\1\174",
            "\1\34\43\uffff\1\46\1\50",
            "\1\34\43\uffff\1\46\1\50",
            "\1\176\1\uffff\1\177",
            "\1\136\44\uffff\1\135",
            "\1\136\44\uffff\1\135",
            "\1\136\44\uffff\1\135\1\u0091",
            "\1\136\44\uffff\1\135\1\u0091",
            "\1\u0083\1\uffff\1\u0084",
            "\1\147\44\uffff\1\146",
            "\1\147\44\uffff\1\146",
            "\1\147\44\uffff\1\146\1\u0092",
            "\1\147\44\uffff\1\146\1\u0092",
            "\1\u0088\1\uffff\1\u0089",
            "\1\160\44\uffff\1\157",
            "\1\160\44\uffff\1\157",
            "\1\160\44\uffff\1\157\1\u0093",
            "\1\160\44\uffff\1\157\1\u0093",
            "\1\u008d\1\uffff\1\u008e",
            "\1\171\44\uffff\1\170",
            "\1\171\44\uffff\1\170",
            "\1\171\44\uffff\1\170\1\u0094",
            "\1\171\44\uffff\1\170\1\u0094",
            "\1\u0096\1\uffff\1\u0097\61\uffff\1\u0095",
            "\1\u0099\1\uffff\1\u009a\61\uffff\1\u0098",
            "\1\u009c\1\uffff\1\u009d\61\uffff\1\u009b",
            "\1\u009f\1\uffff\1\u00a0\61\uffff\1\u009e",
            "\1\u0096\1\uffff\1\u0097",
            "\1\136\44\uffff\1\135",
            "\1\136\44\uffff\1\135",
            "\1\u0099\1\uffff\1\u009a",
            "\1\147\44\uffff\1\146",
            "\1\147\44\uffff\1\146",
            "\1\u009c\1\uffff\1\u009d",
            "\1\160\44\uffff\1\157",
            "\1\160\44\uffff\1\157",
            "\1\u009f\1\uffff\1\u00a0",
            "\1\171\44\uffff\1\170",
            "\1\171\44\uffff\1\170"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1193:1: (lv_definedType_0_1= rulePrimitiveType | lv_definedType_0_2= ruleArrayType )";
        }
    }
    static final String DFA56_eotS =
        "\16\uffff";
    static final String DFA56_eofS =
        "\1\1\2\uffff\2\6\11\uffff";
    static final String DFA56_minS =
        "\1\20\1\uffff\1\4\2\20\1\4\2\uffff\2\17\1\4\1\uffff\2\17";
    static final String DFA56_maxS =
        "\1\121\1\uffff\1\6\2\121\1\120\2\uffff\2\121\1\120\1\uffff\2\121";
    static final String DFA56_acceptS =
        "\1\uffff\1\4\4\uffff\1\1\1\2\3\uffff\1\3\2\uffff";
    static final String DFA56_specialS =
        "\16\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\1\1\uffff\2\1\1\uffff\1\1\2\uffff\2\1\1\uffff\1\1\13\uffff"+
            "\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff\6\1\1\2\1\1\3\uffff\2\1"+
            "\3\uffff\3\1\5\uffff\10\1\1\uffff\1\1",
            "",
            "\1\4\1\uffff\1\3",
            "\2\6\1\uffff\2\6\1\uffff\1\6\2\uffff\2\6\1\5\1\6\13\uffff\2"+
            "\6\1\uffff\1\6\1\uffff\2\6\1\uffff\10\6\3\uffff\2\6\3\uffff"+
            "\3\6\5\uffff\10\6\1\uffff\1\6",
            "\2\6\1\uffff\2\6\1\uffff\1\6\2\uffff\2\6\1\5\1\6\13\uffff\2"+
            "\6\1\uffff\1\6\1\uffff\2\6\1\uffff\10\6\3\uffff\2\6\3\uffff"+
            "\3\6\5\uffff\10\6\1\uffff\1\6",
            "\1\11\1\7\1\10\3\7\5\uffff\1\7\13\uffff\2\7\1\uffff\1\7\11"+
            "\uffff\1\7\1\uffff\1\7\1\uffff\1\7\2\uffff\1\7\10\uffff\2\7"+
            "\1\uffff\1\7\1\uffff\3\7\20\uffff\1\7",
            "",
            "",
            "\1\7\1\12\3\uffff\1\13\1\uffff\1\7\2\uffff\4\7\13\uffff\1\7"+
            "\11\uffff\5\7\1\13\3\uffff\1\7\4\uffff\4\7\4\uffff\10\7\1\uffff"+
            "\1\7",
            "\1\7\1\12\3\uffff\1\13\1\uffff\1\7\2\uffff\4\7\13\uffff\1\7"+
            "\11\uffff\5\7\1\13\3\uffff\1\7\4\uffff\4\7\4\uffff\10\7\1\uffff"+
            "\1\7",
            "\1\15\1\7\1\14\3\7\5\uffff\1\7\13\uffff\1\7\2\uffff\1\7\11"+
            "\uffff\1\7\1\uffff\1\7\1\uffff\1\7\2\uffff\1\7\10\uffff\2\7"+
            "\1\uffff\1\7\1\uffff\3\7\20\uffff\1\7",
            "",
            "\1\7\1\12\3\uffff\1\13\1\uffff\1\7\2\uffff\4\7\13\uffff\1\7"+
            "\11\uffff\5\7\1\13\3\uffff\1\7\4\uffff\4\7\4\uffff\10\7\1\uffff"+
            "\1\7",
            "\1\7\1\12\3\uffff\1\13\1\uffff\1\7\2\uffff\4\7\13\uffff\1\7"+
            "\11\uffff\5\7\1\13\3\uffff\1\7\4\uffff\4\7\4\uffff\10\7\1\uffff"+
            "\1\7"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "()* loopback of 3343:1: ( ( () otherlv_2= '.' ( ( ruleValidID ) ) ) | ( () otherlv_5= '.' ( ( ruleValidID ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) | ( () otherlv_13= '.' ( (lv_identifier_14_0= ruleValidID ) ) otherlv_15= '(' ( (lv_variables_16_0= ruleIterationVariable ) ) (otherlv_17= ',' ( (lv_variables_18_0= ruleIterationVariable ) ) )* (otherlv_19= ';' ( (lv_accumulator_20_0= ruleIterationAccumulator ) ) )? (otherlv_21= ';' ( (lv_breakCondition_22_0= ruleExpression ) ) )? otherlv_23= '|' ( (lv_expression_24_0= ruleExpression ) ) otherlv_25= ')' ) )*";
        }
    }
    static final String DFA69_eotS =
        "\10\uffff";
    static final String DFA69_eofS =
        "\1\uffff\2\5\3\uffff\2\5";
    static final String DFA69_minS =
        "\1\4\2\17\1\4\2\uffff\2\17";
    static final String DFA69_maxS =
        "\1\6\2\121\1\6\2\uffff\2\121";
    static final String DFA69_acceptS =
        "\4\uffff\1\2\1\1\2\uffff";
    static final String DFA69_specialS =
        "\1\uffff\1\0\1\3\3\uffff\1\1\1\2}>";
    static final String[] DFA69_transitionS = {
            "\1\2\1\uffff\1\1",
            "\3\5\1\uffff\2\5\1\uffff\1\5\2\uffff\2\5\1\4\1\5\13\uffff\2"+
            "\5\1\uffff\1\5\1\uffff\2\5\1\uffff\10\5\3\uffff\2\5\3\uffff"+
            "\3\5\1\3\4\uffff\10\5\1\uffff\1\5",
            "\3\5\1\uffff\2\5\1\uffff\1\5\2\uffff\2\5\1\4\1\5\13\uffff\2"+
            "\5\1\uffff\1\5\1\uffff\2\5\1\uffff\10\5\3\uffff\2\5\3\uffff"+
            "\3\5\1\3\4\uffff\10\5\1\uffff\1\5",
            "\1\7\1\uffff\1\6",
            "",
            "",
            "\3\5\1\uffff\2\5\1\uffff\1\5\2\uffff\2\5\1\4\1\5\13\uffff\2"+
            "\5\1\uffff\1\5\1\uffff\2\5\1\uffff\10\5\3\uffff\2\5\3\uffff"+
            "\3\5\1\3\4\uffff\10\5\1\uffff\1\5",
            "\3\5\1\uffff\2\5\1\uffff\1\5\2\uffff\2\5\1\4\1\5\13\uffff\2"+
            "\5\1\uffff\1\5\1\uffff\2\5\1\uffff\10\5\3\uffff\2\5\3\uffff"+
            "\3\5\1\3\4\uffff\10\5\1\uffff\1\5"
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "4203:1: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_stepExpression_3_0= ruleStepExpression ) ) otherlv_4= '}' )? ) | ( ( ( () ( ( ruleQualifiedName ) ) '(' ( ( ( ruleExpression ) ) ( ',' ( ( ruleExpression ) ) )* )? ')' ) )=> ( () ( ( ruleQualifiedName ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleExpression ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleExpression ) ) )* )? otherlv_11= ')' ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_1==67) ) {s = 3;}

                        else if ( (LA69_1==27) && (synpred2_InternalMscript())) {s = 4;}

                        else if ( (LA69_1==EOF||(LA69_1>=15 && LA69_1<=17)||(LA69_1>=19 && LA69_1<=20)||LA69_1==22||(LA69_1>=25 && LA69_1<=26)||LA69_1==28||(LA69_1>=40 && LA69_1<=41)||LA69_1==43||(LA69_1>=45 && LA69_1<=46)||(LA69_1>=48 && LA69_1<=55)||(LA69_1>=59 && LA69_1<=60)||(LA69_1>=64 && LA69_1<=66)||(LA69_1>=72 && LA69_1<=79)||LA69_1==81) ) {s = 5;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_6==EOF||(LA69_6>=15 && LA69_6<=17)||(LA69_6>=19 && LA69_6<=20)||LA69_6==22||(LA69_6>=25 && LA69_6<=26)||LA69_6==28||(LA69_6>=40 && LA69_6<=41)||LA69_6==43||(LA69_6>=45 && LA69_6<=46)||(LA69_6>=48 && LA69_6<=55)||(LA69_6>=59 && LA69_6<=60)||(LA69_6>=64 && LA69_6<=66)||(LA69_6>=72 && LA69_6<=79)||LA69_6==81) ) {s = 5;}

                        else if ( (LA69_6==67) ) {s = 3;}

                        else if ( (LA69_6==27) && (synpred2_InternalMscript())) {s = 4;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_7==EOF||(LA69_7>=15 && LA69_7<=17)||(LA69_7>=19 && LA69_7<=20)||LA69_7==22||(LA69_7>=25 && LA69_7<=26)||LA69_7==28||(LA69_7>=40 && LA69_7<=41)||LA69_7==43||(LA69_7>=45 && LA69_7<=46)||(LA69_7>=48 && LA69_7<=55)||(LA69_7>=59 && LA69_7<=60)||(LA69_7>=64 && LA69_7<=66)||(LA69_7>=72 && LA69_7<=79)||LA69_7==81) ) {s = 5;}

                        else if ( (LA69_7==67) ) {s = 3;}

                        else if ( (LA69_7==27) && (synpred2_InternalMscript())) {s = 4;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA69_2==67) ) {s = 3;}

                        else if ( (LA69_2==27) && (synpred2_InternalMscript())) {s = 4;}

                        else if ( (LA69_2==EOF||(LA69_2>=15 && LA69_2<=17)||(LA69_2>=19 && LA69_2<=20)||LA69_2==22||(LA69_2>=25 && LA69_2<=26)||LA69_2==28||(LA69_2>=40 && LA69_2<=41)||LA69_2==43||(LA69_2>=45 && LA69_2<=46)||(LA69_2>=48 && LA69_2<=55)||(LA69_2>=59 && LA69_2<=60)||(LA69_2>=64 && LA69_2<=66)||(LA69_2>=72 && LA69_2<=79)||LA69_2==81) ) {s = 5;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_ruleModule130 = new BitSet(new long[]{0x0000000001A44002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_ruleDefinition223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleDefinition250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeDefinition_in_entryRuleDataTypeDefinition285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeDefinition295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_ruleDataTypeDefinition342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordDefinition_in_ruleDataTypeDefinition369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAliasDefinition_in_ruleDataTypeDefinition396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationDefinition_in_entryRuleEnumerationDefinition431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationDefinition441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleEnumerationDefinition478 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleEnumerationDefinition499 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEnumerationDefinition511 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralDeclaration_in_ruleEnumerationDefinition533 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleEnumerationDefinition546 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralDeclaration_in_ruleEnumerationDefinition567 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleEnumerationDefinition583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralDeclaration_in_entryRuleEnumerationLiteralDeclaration619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralDeclaration629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleEnumerationLiteralDeclaration674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAliasDefinition_in_entryRuleTypeAliasDefinition709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAliasDefinition719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTypeAliasDefinition756 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleTypeAliasDefinition777 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTypeAliasDefinition789 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleTypeAliasDefinition810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTypeAliasDefinition822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordDefinition_in_entryRuleRecordDefinition858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordDefinition868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRecordDefinition905 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRecordDefinition926 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRecordDefinition938 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleRecordFieldDeclaration_in_ruleRecordDefinition959 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_17_in_ruleRecordDefinition972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordFieldDeclaration_in_entryRuleRecordFieldDeclaration1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordFieldDeclaration1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRecordFieldDeclaration1064 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRecordFieldDeclaration1076 = new BitSet(new long[]{0x000000FC00000010L});
    public static final BitSet FOLLOW_ruleDataTypeSpecifier_in_ruleRecordFieldDeclaration1097 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRecordFieldDeclaration1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionDefinition1198 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionDefinition1224 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFunctionDefinition1245 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionDefinition1258 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1279 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition1292 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1313 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionDefinition1327 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionDefinition1341 = new BitSet(new long[]{0x0000000010000050L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1363 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition1376 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1397 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionDefinition1413 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionDefinition1425 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1446 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDefinition1459 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDefinition1480 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDefinition1494 = new BitSet(new long[]{0xEB009503C80283F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAssertion_in_ruleFunctionDefinition1516 = new BitSet(new long[]{0xEB009503C80283F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleFunctionObjectDeclaration_in_ruleFunctionDefinition1543 = new BitSet(new long[]{0xEB009503C80283F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_ruleFunctionDefinition1570 = new BitSet(new long[]{0xEB009503C80283F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEquation_in_ruleFunctionDefinition1597 = new BitSet(new long[]{0xEB009503C80283F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionDefinition1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleParameterDeclaration1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertion_in_entryRuleAssertion1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertion1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAssertion1790 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAssertion1816 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssertion1837 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAssertion1849 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleAssertionStatusKind_in_ruleAssertion1870 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssertion1891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAssertion1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateVariableDeclaration_in_entryRuleStateVariableDeclaration1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateVariableDeclaration1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStateVariableDeclaration1986 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStateVariableDeclaration2007 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStateVariableDeclaration2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionObjectDeclaration_in_entryRuleFunctionObjectDeclaration2055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionObjectDeclaration2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFunctionObjectDeclaration2102 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFunctionObjectDeclaration2123 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionObjectDeclaration2135 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFunctionObjectDeclaration2158 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionObjectDeclaration2171 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionObjectDeclaration2192 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionObjectDeclaration2205 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionObjectDeclaration2226 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionObjectDeclaration2240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionObjectDeclaration2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquation_in_entryRuleEquation2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquation2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEquation2346 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEquation2358 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEquation2379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEquation2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeSpecifier_in_entryRuleDataTypeSpecifier2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeSpecifier2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleDataTypeSpecifier2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleDataTypeSpecifier2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataTypeSpecifier2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType2569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_rulePrimitiveType2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rulePrimitiveType2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_rulePrimitiveType2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_entryRuleNumericType2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericType2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealType_in_ruleNumericType2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_ruleNumericType2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_ruleNumericType2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGaussianType_in_ruleNumericType2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealType_in_entryRuleRealType2888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealType2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRealType2944 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleRealType2957 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleRealType2978 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRealType2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerType_in_entryRuleIntegerType3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerType3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleIntegerType3084 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleIntegerType3097 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleIntegerType3118 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIntegerType3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexType_in_entryRuleComplexType3168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexType3178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleComplexType3224 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleComplexType3237 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleComplexType3258 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleComplexType3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGaussianType_in_entryRuleGaussianType3308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGaussianType3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGaussianType3364 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleGaussianType3377 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleGaussianType3398 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleGaussianType3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_entryRuleBooleanType3448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanType3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBooleanType3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringType_in_entryRuleStringType3540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringType3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStringType3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType3632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTensorType_in_ruleArrayType3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleArrayType3749 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArrayType3775 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleArrayType3789 = new BitSet(new long[]{0xEB009703C80183F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleArrayDimension_in_ruleArrayType3810 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayType3823 = new BitSet(new long[]{0xEB009703C80183F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleArrayDimension_in_ruleArrayType3844 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleArrayType3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTensorType_in_entryRuleTensorType3895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTensorType3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericType_in_ruleTensorType3951 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTensorType3963 = new BitSet(new long[]{0xEB009703C80183F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleArrayDimension_in_ruleTensorType3984 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleTensorType3997 = new BitSet(new long[]{0xEB009703C80183F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleArrayDimension_in_ruleTensorType4018 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleTensorType4032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayDimension_in_entryRuleArrayDimension4068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayDimension4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayDimension4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_ruleExpression4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_ruleExpression4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_ruleExpression4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpression_in_ruleExpression4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression4343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLetExpression4390 = new BitSet(new long[]{0x0000000008000050L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclaration_in_ruleLetExpression4411 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_16_in_ruleLetExpression4424 = new BitSet(new long[]{0x0000000008000050L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclaration_in_ruleLetExpression4445 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_43_in_ruleLetExpression4459 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetExpression4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclaration_in_entryRuleLetExpressionVariableDeclaration4516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpressionVariableDeclaration4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclarationPart_in_ruleLetExpressionVariableDeclaration4573 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_27_in_ruleLetExpressionVariableDeclaration4592 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclarationPart_in_ruleLetExpressionVariableDeclaration4613 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleLetExpressionVariableDeclaration4626 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclarationPart_in_ruleLetExpressionVariableDeclaration4647 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleLetExpressionVariableDeclaration4661 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLetExpressionVariableDeclaration4675 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetExpressionVariableDeclaration4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpressionVariableDeclarationPart_in_entryRuleLetExpressionVariableDeclarationPart4732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpressionVariableDeclarationPart4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleLetExpressionVariableDeclarationPart4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpression_in_entryRuleIfExpression4822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpression4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIfExpression4875 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleIfExpression4901 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression4922 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleIfExpression4934 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression4955 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleIfExpression4967 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfExpression4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression5024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchExpression5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleSwitchExpression5077 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleSwitchExpression5103 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression5124 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitchExpression5145 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_ruleSwitchExpression5158 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSwitchExpression5170 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase5227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSwitchCase5274 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleSwitchCase5295 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSwitchCase5307 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchCase5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpression_in_entryRuleRangeExpression5364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeExpression5374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleRangeExpression5421 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRangeExpression5442 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleRangeExpression5463 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRangeExpression5476 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_ruleRangeExpression5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpression_in_entryRuleImpliesExpression5537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpression5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleImpliesExpression5594 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleImpliesExpression5615 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleImpliesExpression5636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5731 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLogicalOrExpression5752 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5773 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleLogicalAndExpression5868 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLogicalAndExpression5889 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleLogicalAndExpression5910 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression5948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression6005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleEqualityOperator_in_ruleEqualityExpression6035 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression6056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression6094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression6151 = new BitSet(new long[]{0x0020000006000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleRelationalOperator_in_ruleRelationalExpression6182 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleRelationalExpression6232 = new BitSet(new long[]{0x000000FC00000010L});
    public static final BitSet FOLLOW_ruleDataTypeSpecifier_in_ruleRelationalExpression6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6349 = new BitSet(new long[]{0x0800000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleAdditiveExpression6379 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6400 = new BitSet(new long[]{0x0800000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowerExpression_in_ruleMultiplicativeExpression6495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006003L});
    public static final BitSet FOLLOW_ruleMultiplicativeOperator_in_ruleMultiplicativeExpression6525 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulePowerExpression_in_ruleMultiplicativeExpression6546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006003L});
    public static final BitSet FOLLOW_rulePowerExpression_in_entryRulePowerExpression6584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowerExpression6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePowerExpression6641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008004L});
    public static final BitSet FOLLOW_rulePowerOperator_in_rulePowerExpression6671 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rulePowerExpression6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixExpression_in_ruleUnaryExpression6787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOperator_in_ruleUnaryExpression6823 = new BitSet(new long[]{0xE3000100080083F0L});
    public static final BitSet FOLLOW_rulePostfixExpression_in_ruleUnaryExpression6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfixExpression_in_entryRulePostfixExpression6881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfixExpression6891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayElementAccess_in_rulePostfixExpression6938 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_rulePostfixOperator_in_rulePostfixExpression6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayElementAccess_in_entryRuleArrayElementAccess7006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayElementAccess7016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_ruleArrayElementAccess7063 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleArrayElementAccess7084 = new BitSet(new long[]{0xEB009503C84083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleArraySubscript_in_ruleArrayElementAccess7105 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_16_in_ruleArrayElementAccess7118 = new BitSet(new long[]{0xEB009503C84083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleArraySubscript_in_ruleArrayElementAccess7139 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41_in_ruleArrayElementAccess7153 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleMemberFeatureCall_in_entryRuleMemberFeatureCall7191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMemberFeatureCall7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMemberFeatureCall7248 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMemberFeatureCall7270 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMemberFeatureCall7293 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMemberFeatureCall7322 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMemberFeatureCall7345 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMemberFeatureCall7357 = new BitSet(new long[]{0xEB009503D80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall7379 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleMemberFeatureCall7392 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall7413 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleMemberFeatureCall7429 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMemberFeatureCall7458 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleMemberFeatureCall7479 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMemberFeatureCall7491 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIterationVariable_in_ruleMemberFeatureCall7512 = new BitSet(new long[]{0x0080000000110000L});
    public static final BitSet FOLLOW_16_in_ruleMemberFeatureCall7525 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIterationVariable_in_ruleMemberFeatureCall7546 = new BitSet(new long[]{0x0080000000110000L});
    public static final BitSet FOLLOW_20_in_ruleMemberFeatureCall7561 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIterationAccumulator_in_ruleMemberFeatureCall7582 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMemberFeatureCall7597 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall7618 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleMemberFeatureCall7632 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleMemberFeatureCall7653 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMemberFeatureCall7665 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleIterationVariable_in_entryRuleIterationVariable7704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationVariable7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIterationVariable7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIterationAccumulator_in_entryRuleIterationAccumulator7794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIterationAccumulator7804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIterationAccumulator7850 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIterationAccumulator7862 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIterationAccumulator7883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArraySubscript_in_entryRuleArraySubscript7919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArraySubscript7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleArraySubscript7972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArraySubscript8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression8105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_rulePrimaryExpression8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitConstructionOperator_in_rulePrimaryExpression8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayConstructionOperator_in_rulePrimaryExpression8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayConcatenationOperator_in_rulePrimaryExpression8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_rulePrimaryExpression8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginExpression_in_rulePrimaryExpression8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndExpression_in_rulePrimaryExpression8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral8329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_ruleLiteral8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteral8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral8440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral8475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericLiteral8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_ruleNumericLiteral8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleNumericLiteral8559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealLiteral_in_entryRuleRealLiteral8594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealLiteral8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidDouble_in_ruleRealLiteral8650 = new BitSet(new long[]{0x0000000008000052L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleRealLiteral8671 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleRealLiteral8685 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleRealLiteral8706 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRealLiteral8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral8756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral8766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidLong_in_ruleIntegerLiteral8812 = new BitSet(new long[]{0x0000000008000052L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIntegerLiteral8833 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleIntegerLiteral8847 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleIntegerLiteral8868 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIntegerLiteral8880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBooleanLiteral8981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBooleanLiteral9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall9140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall9150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureCall9208 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleFeatureCall9221 = new BitSet(new long[]{0x08000000000002C0L});
    public static final BitSet FOLLOW_ruleStepExpression_in_ruleFeatureCall9242 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFeatureCall9254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleFeatureCall9352 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFeatureCall9364 = new BitSet(new long[]{0xEB009503D80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall9386 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleFeatureCall9399 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFeatureCall9420 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleFeatureCall9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepExpression_in_entryRuleStepExpression9474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepExpression9484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeStepExpression_in_ruleStepExpression9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeStepExpression_in_entryRuleRangeStepExpression9564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeStepExpression9574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveStepExpression_in_ruleRangeStepExpression9621 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleRangeStepExpression9642 = new BitSet(new long[]{0x08000000000002C0L});
    public static final BitSet FOLLOW_ruleAdditiveStepExpression_in_ruleRangeStepExpression9663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveStepExpression_in_entryRuleAdditiveStepExpression9701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveStepExpression9711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegateStepExpression_in_ruleAdditiveStepExpression9758 = new BitSet(new long[]{0x0800000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAdditiveOperator_in_ruleAdditiveStepExpression9788 = new BitSet(new long[]{0x08000000000002C0L});
    public static final BitSet FOLLOW_ruleNegateStepExpression_in_ruleAdditiveStepExpression9809 = new BitSet(new long[]{0x0800000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleNegateStepExpression_in_entryRuleNegateStepExpression9847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegateStepExpression9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveStepExpression_in_ruleNegateStepExpression9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNegateStepExpression9931 = new BitSet(new long[]{0x00000000000002C0L});
    public static final BitSet FOLLOW_rulePrimitiveStepExpression_in_ruleNegateStepExpression9952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveStepExpression_in_entryRulePrimitiveStepExpression9989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveStepExpression9999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepLiteral_in_rulePrimitiveStepExpression10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepN_in_rulePrimitiveStepExpression10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepLiteral_in_entryRuleStepLiteral10108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepLiteral10118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidInt_in_ruleStepLiteral10163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepN_in_entryRuleStepN10198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepN10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_N_in_ruleStepN10253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayConstructionOperator_in_entryRuleArrayConstructionOperator10288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayConstructionOperator10298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleArrayConstructionOperator10335 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayConstructionOperator10356 = new BitSet(new long[]{0x1000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleArrayConstructionOperator10370 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayConstructionOperator10391 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_60_in_ruleArrayConstructionOperator10412 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArrayConstructionIterationClause_in_ruleArrayConstructionOperator10433 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleArrayConstructionOperator10446 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArrayConstructionIterationClause_in_ruleArrayConstructionOperator10467 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleArrayConstructionOperator10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayConstructionIterationClause_in_entryRuleArrayConstructionIterationClause10519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayConstructionIterationClause10529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleArrayConstructionIterationClause10575 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleArrayConstructionIterationClause10587 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayConstructionIterationClause10608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayConcatenationOperator_in_entryRuleArrayConcatenationOperator10644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayConcatenationOperator10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleArrayConcatenationOperator10691 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleArrayConcatenationOperator10712 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_20_in_ruleArrayConcatenationOperator10725 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleArrayConcatenationOperator10746 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_41_in_ruleArrayConcatenationOperator10760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList10796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList10806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList10852 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleExpressionList10865 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList10886 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleUnitConstructionOperator_in_entryRuleUnitConstructionOperator10924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitConstructionOperator10934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUnitConstructionOperator10971 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUnitConstructionOperator10983 = new BitSet(new long[]{0x00000000100000D0L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleUnitConstructionOperator11004 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUnitConstructionOperator11016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression11052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression11062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleParenthesizedExpression11099 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression11120 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_ruleParenthesizedExpression11133 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression11154 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_ruleParenthesizedExpression11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeginExpression_in_entryRuleBeginExpression11204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeginExpression11214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBeginExpression11260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndExpression_in_entryRuleEndExpression11296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndExpression11306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEndExpression11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnit_in_entryRuleUnit11388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnit11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitNumerator_in_ruleUnit11454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleUnit11467 = new BitSet(new long[]{0x00000000080000D0L});
    public static final BitSet FOLLOW_ruleUnitDenominator_in_ruleUnit11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitNumerator_in_entryRuleUnitNumerator11528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitNumerator11538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_in_ruleUnitNumerator11584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitFactor_in_ruleUnitNumerator11612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUnitNumerator11625 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleUnitFactor_in_ruleUnitNumerator11646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitDenominator_in_entryRuleUnitDenominator11685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitDenominator11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitFactor_in_ruleUnitDenominator11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleUnitDenominator11760 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleUnitFactor_in_ruleUnitDenominator11781 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUnitDenominator11794 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleUnitFactor_in_ruleUnitDenominator11815 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUnitDenominator11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitFactor_in_entryRuleUnitFactor11866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitFactor11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleUnitFactor11922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleUnitFactor11935 = new BitSet(new long[]{0x0800000000000280L});
    public static final BitSet FOLLOW_ruleUnitExponent_in_ruleUnitFactor11956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnitExponent_in_entryRuleUnitExponent11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnitExponent12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUnitExponent12045 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_ruleValidInt_in_ruleUnitExponent12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName12173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleQualifiedName12192 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName12214 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleValidDouble_in_entryRuleValidDouble12262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidDouble12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleValidDouble12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidInt_in_entryRuleValidInt12357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidInt12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_in_ruleValidInt12408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValidInt12434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidLong_in_entryRuleValidLong12480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidLong12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ONE_in_ruleValidLong12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValidLong12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID12603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_N_in_ruleValidID12654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleAssertionStatusKind12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAssertionStatusKind12756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAssertionStatusKind12773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAssertionStatusKind12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleEqualityOperator12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleEqualityOperator12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelationalOperator12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleRelationalOperator12914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelationalOperator12931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleRelationalOperator12948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAdditiveOperator12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAdditiveOperator13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleMultiplicativeOperator13055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleMultiplicativeOperator13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleMultiplicativeOperator13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleMultiplicativeOperator13106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePowerOperator13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulePowerOperator13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUnaryOperator13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUnaryOperator13230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rulePostfixOperator13274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_synpred1_InternalMscript3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred1_InternalMscript3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_synpred2_InternalMscript9284 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred2_InternalMscript9290 = new BitSet(new long[]{0xEB009503D80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred2_InternalMscript9298 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalMscript9305 = new BitSet(new long[]{0xEB009503C80083F0L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred2_InternalMscript9312 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_28_in_synpred2_InternalMscript9322 = new BitSet(new long[]{0x0000000000000002L});

}