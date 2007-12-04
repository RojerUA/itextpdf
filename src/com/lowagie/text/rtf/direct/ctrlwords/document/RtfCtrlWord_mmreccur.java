/* $Id$
 * $Name$
 *
 * Copyright 2007 by Howard Shank (hgshank@yahoo.com)
 *
 * The contents of this file are subject to the Mozilla Public License Version 1.1
 * (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the License.
 *
 * The Original Code is 'iText, a free JAVA-PDF library'.
 *
 * The Initial Developer of the Original Code is Bruno Lowagie. Portions created by
 * the Initial Developer are Copyright (C) 1999-2006 by Bruno Lowagie.
 * All Rights Reserved.
 * Co-Developer of the code is Paulo Soares. Portions created by the Co-Developer
 * are Copyright (C) 2000-2006 by Paulo Soares. All Rights Reserved.
 *
 * Contributor(s): all the names of the contributors are added in the source code
 * where applicable.
 *
 * Alternatively, the contents of this file may be used under the terms of the
 * LGPL license (the ?GNU LIBRARY GENERAL PUBLIC LICENSE?), in which case the
 * provisions of LGPL are applicable instead of those above.  If you wish to
 * allow use of your version of this file only under the terms of the LGPL
 * License and not to allow others to use your version of this file under
 * the MPL, indicate your decision by deleting the provisions above and
 * replace them with the notice and other provisions required by the LGPL.
 * If you do not delete the provisions above, a recipient may use your version
 * of this file under either the MPL or the GNU LIBRARY GENERAL PUBLIC LICENSE.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the MPL as stated above or under the terms of the GNU
 * Library General Public License as published by the Free Software Foundation;
 * either version 2 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Library general Public License for more
 * details.
 *
 * If you didn't download this code from the following link, you should check if
 * you aren't using an obsolete version:
 * http://www.lowagie.com/iText/
 */
 
package com.lowagie.text.rtf.direct.ctrlwords.document;

import com.lowagie.text.rtf.direct.RtfParser;
import com.lowagie.text.rtf.direct.ctrlwords.basectrlwords.RtfCtrlWordBase_mmreccur;

/**
 * Description:
 * 	,"Specifies that the hosting application shall display the
 * 	given record from the specified external data source in
 * 	place of the fields to which its data is mapped via the
 * 	<mmodsofldmpdata> control word in a merged document. When
 * 	this control word is present, the parameter shall specify
 * 	the one-based index of the record from that data source that
 * 	shall be used to populate this document.
 * 	If the
 * 	<mmreccur> control word is omitted with the <mmshowdata>
 * 	control word present, the hosting application shall behave
 * 	as if the <mmreccur> control word?s parameter was equal to
 * 	1. If the <mmshowdata> control word is omitted, this control
 * 	word shall be ignored. If the <mmreccur> control word?s
 * 	parameter is less than 1 or greater than the number of
 * 	records in the specified external data source, the hosting
 * 	application shall treat this parameter as if it were equal
 * 	to 1.
 * Group:
 * 	Mail Merge
 * Type:
 * 	Value
 * Default Param:
 * 	0
 * Pass Default:
 * 	true
 * RTF Version:
 * 	
 */

public class RtfCtrlWord_mmreccur extends RtfCtrlWordBase_mmreccur {

	public RtfCtrlWord_mmreccur(RtfParser rtfParser){
		super(rtfParser);
	}

}
