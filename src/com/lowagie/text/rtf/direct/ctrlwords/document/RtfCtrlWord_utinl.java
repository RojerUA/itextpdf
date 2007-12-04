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
import com.lowagie.text.rtf.direct.ctrlwords.basectrlwords.RtfCtrlWordBase_utinl;

/**
 * Description:
 * 	,"This control word specifies whether applications shall
 * 	underline the character following the numbering defined when
 * 	both the numbering itself and the first letter of the
 * 	corresponding numbered paragraph are underlined.
 *
 * 		Typically, the tab or space character generated between
 * 	numbering and the corresponding paragraph of text is never
 * 	formatted, since it is automatically generated. This control
 * 	word specifies that the tab or space shall be underlined the
 * 	same way as the numbering symbol itself in the following
 * 	conditions:
 * 	The numbering is underlined
 * 	The first
 * 	character of the paragraph is underlined
 * 	Example:
 * 	Consider an RTF document with two numbered paragraphs: one
 * 	with underlined text and the other without. The default
 * 	presentation would have the tab characters free of
 * 	underlining in both cases:
 * 	However, if this control word
 * 	is present, then the second paragraph meets the criteria
 * 	defined above for having the suffix character underlined,
 * 	resulting in the following output:
 * 	Note   This control
 * 	word is used to maintain compatibility with documents
 * 	created by Microsoft Office Word 2003.
 * Group:
 * 	Document Formatting Properties
 * Type:
 * 	Flag
 * Default Param:
 * 	0
 * Pass Default:
 * 	false
 * RTF Version:
 * 	
 */

public class RtfCtrlWord_utinl extends RtfCtrlWordBase_utinl {

	public RtfCtrlWord_utinl(RtfParser rtfParser){
		super(rtfParser);
	}

}
