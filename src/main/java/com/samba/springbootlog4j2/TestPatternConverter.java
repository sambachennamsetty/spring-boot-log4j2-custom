package com.samba.springbootlog4j2;

import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
import org.apache.logging.log4j.core.pattern.PatternConverter;

@Plugin(name = "TestPatternConverter", category = PatternConverter.CATEGORY)
@ConverterKeys({"e"})
public final class TestPatternConverter extends LogEventPatternConverter {

	
	/**
	 * Private constructor.
	 * @param options options, may be null.
	 */
	private TestPatternConverter(final String[] options) {
		super("TestId", "testId");
	}

	/**
	 * Obtains an instance of pattern converter.
	 *
	 * @param options options, may be null.
	 * @return instance of pattern converter.
	 */
	public static TestPatternConverter newInstance(final String[] options) {
		return new TestPatternConverter(options);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void format(final LogEvent event, final StringBuilder toAppendTo) {
		String name="";
		if(name==null|| name.isEmpty())
		{
			toAppendTo.append("null");
		}
		toAppendTo.append(name);
	}
}