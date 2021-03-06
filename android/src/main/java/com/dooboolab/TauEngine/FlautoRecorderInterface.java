package com.dooboolab.TauEngine;
/*
 * Copyright 2018, 2019, 2020 Dooboolab.
 *
 * This file is part of the Tau project.
 *
 * Tau is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3 (LGPL-V3), as published by
 * the Free Software Foundation.
 *
 * Tau is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Tau project.  If not, see <https://www.gnu.org/licenses/>.
 */


import java.io.IOException;
import com.dooboolab.TauEngine.Flauto.t_CODEC;


public interface FlautoRecorderInterface
{
	public void _startRecorder
		(
			Integer numChannels,
			Integer sampleRate,
			Integer bitRate,
			t_CODEC codec,
			String path,
			int audioSource,
			FlautoRecorder session,
			int bufferSize
		)
		throws
		IOException, Exception;
	public void _stopRecorder (  ) throws Exception;
	public boolean pauseRecorder( );
	public boolean resumeRecorder(  );
	public double getMaxAmplitude ();

}
