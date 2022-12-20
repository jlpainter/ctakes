package org.apache.ctakes.core.util;

import org.apache.ctakes.core.util.log.FinishedLogger;
import org.apache.log4j.Logger;

/**
 * @author SPF , chip-nlp
 * @since {1/14/2022}
 */
final public class BannerWriter {

   // The ProgressDone logger in our ctakes log4j configuration hides the name of the logger.
   static private final Logger EOL_LOGGER = Logger.getLogger( "ProgressDone" );

   private BannerWriter() {
   }


   static public void writeHello() {
      EOL_LOGGER.info( "\n" );
      EOL_LOGGER.info( "   Welcome to" );
      EOL_LOGGER.info( "\n" );
      EOL_LOGGER.info( "      _/_/                                  _/" );
      EOL_LOGGER.info( "   _/    _/  _/_/_/      _/_/_/    _/_/_/  _/_/_/      _/_/" );
      EOL_LOGGER.info( "  _/_/_/_/  _/    _/  _/    _/  _/        _/    _/  _/_/_/_/" );
      EOL_LOGGER.info( " _/    _/  _/    _/  _/    _/  _/        _/    _/  _/" );
      EOL_LOGGER.info( "_/    _/  _/_/_/      _/_/_/    _/_/_/  _/    _/    _/_/_/" );
      EOL_LOGGER.info( "         _/" );
      EOL_LOGGER.info( "        _/" );
      EOL_LOGGER.info( "                        _/_/_/_/_/    _/_/    _/    _/  _/_/_/_/    _/_/_/" );
      EOL_LOGGER.info( "               _/_/_/      _/      _/    _/  _/  _/    _/        _/" );
      EOL_LOGGER.info( "            _/            _/      _/_/_/_/  _/_/      _/_/_/      _/_/" );
      EOL_LOGGER.info( "           _/            _/      _/    _/  _/  _/    _/              _/" );
      EOL_LOGGER.info( "            _/_/_/      _/      _/    _/  _/    _/  _/_/_/_/  _/_/_/" );
      EOL_LOGGER.info( "\n" );
      EOL_LOGGER.info( FinishedLogger.getBuildInfo() );
   }

   static public void writeInitialize() {
      EOL_LOGGER.info( "\n" );
      EOL_LOGGER.info( "    _/_/_/            _/    _/      _/            _/  _/" );
      EOL_LOGGER.info( "     _/    _/_/_/        _/_/_/_/        _/_/_/  _/      _/_/_/_/    _/_/" );
      EOL_LOGGER.info( "    _/    _/    _/  _/    _/      _/  _/    _/  _/  _/      _/    _/_/_/_/" );
      EOL_LOGGER.info( "   _/    _/    _/  _/    _/      _/  _/    _/  _/  _/    _/      _/" );
      EOL_LOGGER.info( "_/_/_/  _/    _/  _/      _/_/  _/    _/_/_/  _/  _/  _/_/_/_/    _/_/_/" );
      EOL_LOGGER.info( "\n" );
   }

   static public void writeProcess() {
      EOL_LOGGER.info( "\n" );
      EOL_LOGGER.info( "    _/_/_/" );
      EOL_LOGGER.info( "   _/    _/  _/  _/_/    _/_/      _/_/_/    _/_/      _/_/_/    _/_/_/" );
      EOL_LOGGER.info( "  _/_/_/    _/_/      _/    _/  _/        _/_/_/_/  _/_/      _/_/" );
      EOL_LOGGER.info( " _/        _/        _/    _/  _/        _/            _/_/      _/_/" );
      EOL_LOGGER.info( "_/        _/          _/_/      _/_/_/    _/_/_/  _/_/_/    _/_/_/" );
      EOL_LOGGER.info( "\n" );
   }

   static public void writeFinished() {
      EOL_LOGGER.info( "\n" );
      EOL_LOGGER.info( "    _/_/_/_/  _/            _/            _/                        _/" );
      EOL_LOGGER.info( "   _/            _/_/_/          _/_/_/  _/_/_/      _/_/      _/_/_/" );
      EOL_LOGGER.info( "  _/_/_/    _/  _/    _/  _/  _/_/      _/    _/  _/_/_/_/  _/    _/" );
      EOL_LOGGER.info( " _/        _/  _/    _/  _/      _/_/  _/    _/  _/        _/    _/" );
      EOL_LOGGER.info( "_/        _/  _/    _/  _/  _/_/_/    _/    _/    _/_/_/    _/_/_/" );
      EOL_LOGGER.info( "\n" );
   }


}