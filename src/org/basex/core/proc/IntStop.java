package org.basex.core.proc;

import org.basex.core.Process;
import org.basex.core.User;

/**
 * Internal command, stopping the server.
 *
 * @author Workgroup DBIS, University of Konstanz 2005-09, ISC License
 * @author Christian Gruen
 */
public final class IntStop extends Process {
  /**
   * Default constructor.
   */
  public IntStop() {
    super(STANDARD | User.ADMIN);
  }
}
