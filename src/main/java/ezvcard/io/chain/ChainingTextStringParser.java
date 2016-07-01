package ezvcard.io.chain;

import java.io.IOException;
import java.util.List;

import ezvcard.Ezvcard;
import ezvcard.VCard;

/*
 Copyright (c) 2012-2016, Michael Angstadt
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met: 

 1. Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer. 
 2. Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution. 

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Chainer class for parsing traditional, plain-text vCards from strings.
 * @see Ezvcard#parse(String)
 * @author Michael Angstadt
 */
public class ChainingTextStringParser extends ChainingTextParser<ChainingTextStringParser> {
	public ChainingTextStringParser(String string) {
		super(string);
	}

	@Override
	public VCard first() {
		try {
			return super.first();
		} catch (IOException e) {
			//should never be thrown because we're reading from a string
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<VCard> all() {
		try {
			return super.all();
		} catch (IOException e) {
			//should never be thrown because we're reading from a string
			throw new RuntimeException(e);
		}
	}
}
