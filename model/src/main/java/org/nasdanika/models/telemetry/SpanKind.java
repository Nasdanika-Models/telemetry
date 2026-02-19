/**
 */
package org.nasdanika.models.telemetry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration '<em><b>Span Kind</b></em>',
 * and utility methods for working with them.
 * @generated
 */
public enum SpanKind implements Enumerator {
	/**
	 * The '<em><b>SPAN KIND UNSPECIFIED</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	SPAN_KIND_UNSPECIFIED(0, "SPAN_KIND_UNSPECIFIED", "SPAN_KIND_UNSPECIFIED"),

	/**
	 * The '<em><b>SPAN KIND INTERNAL</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	SPAN_KIND_INTERNAL(1, "SPAN_KIND_INTERNAL", "SPAN_KIND_INTERNAL"),

	/**
	 * The '<em><b>SPAN KIND SERVER</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	SPAN_KIND_SERVER(2, "SPAN_KIND_SERVER", "SPAN_KIND_SERVER"),

	/**
	 * The '<em><b>SPAN KIND CLIENT</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	SPAN_KIND_CLIENT(3, "SPAN_KIND_CLIENT", "SPAN_KIND_CLIENT"),

	/**
	 * The '<em><b>SPAN KIND PRODUCER</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	SPAN_KIND_PRODUCER(4, "SPAN_KIND_PRODUCER", "SPAN_KIND_PRODUCER"),

	/**
	 * The '<em><b>SPAN KIND CONSUMER</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	SPAN_KIND_CONSUMER(5, "SPAN_KIND_CONSUMER", "SPAN_KIND_CONSUMER");

	/**
	 * The '<em><b>SPAN KIND UNSPECIFIED</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_KIND_UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>SPAN KIND INTERNAL</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_KIND_INTERNAL_VALUE = 1;

	/**
	 * The '<em><b>SPAN KIND SERVER</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_KIND_SERVER_VALUE = 2;

	/**
	 * The '<em><b>SPAN KIND CLIENT</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_KIND_CLIENT_VALUE = 3;

	/**
	 * The '<em><b>SPAN KIND PRODUCER</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_KIND_PRODUCER_VALUE = 4;

	/**
	 * The '<em><b>SPAN KIND CONSUMER</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int SPAN_KIND_CONSUMER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Span Kind</b></em>' enumerators.
	 * @generated
	 */
	private static final SpanKind[] VALUES_ARRAY =
		new SpanKind[] {
			SPAN_KIND_UNSPECIFIED,
			SPAN_KIND_INTERNAL,
			SPAN_KIND_SERVER,
			SPAN_KIND_CLIENT,
			SPAN_KIND_PRODUCER,
			SPAN_KIND_CONSUMER,
		};

	/**
	 * A public read-only list of all the '<em><b>Span Kind</b></em>' enumerators.
	 * @generated
	 */
	public static final List<SpanKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Span Kind</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpanKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpanKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Span Kind</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpanKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpanKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Span Kind</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpanKind get(int value) {
		switch (value) {
			case SPAN_KIND_UNSPECIFIED_VALUE: return SPAN_KIND_UNSPECIFIED;
			case SPAN_KIND_INTERNAL_VALUE: return SPAN_KIND_INTERNAL;
			case SPAN_KIND_SERVER_VALUE: return SPAN_KIND_SERVER;
			case SPAN_KIND_CLIENT_VALUE: return SPAN_KIND_CLIENT;
			case SPAN_KIND_PRODUCER_VALUE: return SPAN_KIND_PRODUCER;
			case SPAN_KIND_CONSUMER_VALUE: return SPAN_KIND_CONSUMER;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private final int value;

	/**
	 * @generated
	 */
	private final String name;

	/**
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * @generated
	 */
	private SpanKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SpanKind
