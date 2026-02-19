/**
 */
package org.nasdanika.models.telemetry;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * A representation of the literals of the enumeration '<em><b>Status Code</b></em>',
 * and utility methods for working with them.
 * @generated
 */
public enum StatusCode implements Enumerator {
	/**
	 * The '<em><b>STATUS CODE UNSET</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	STATUS_CODE_UNSET(0, "STATUS_CODE_UNSET", "STATUS_CODE_UNSET"),

	/**
	 * The '<em><b>STATUS CODE OK</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	STATUS_CODE_OK(1, "STATUS_CODE_OK", "STATUS_CODE_OK"),

	/**
	 * The '<em><b>STATUS CODE ERROR</b></em>' literal object.
	 * @generated
	 * @ordered
	 */
	STATUS_CODE_ERROR(2, "STATUS_CODE_ERROR", "STATUS_CODE_ERROR");

	/**
	 * The '<em><b>STATUS CODE UNSET</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_CODE_UNSET_VALUE = 0;

	/**
	 * The '<em><b>STATUS CODE OK</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_CODE_OK_VALUE = 1;

	/**
	 * The '<em><b>STATUS CODE ERROR</b></em>' literal value.
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_CODE_ERROR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Status Code</b></em>' enumerators.
	 * @generated
	 */
	private static final StatusCode[] VALUES_ARRAY =
		new StatusCode[] {
			STATUS_CODE_UNSET,
			STATUS_CODE_OK,
			STATUS_CODE_ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>Status Code</b></em>' enumerators.
	 * @generated
	 */
	public static final List<StatusCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StatusCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Status Code</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StatusCode get(int value) {
		switch (value) {
			case STATUS_CODE_UNSET_VALUE: return STATUS_CODE_UNSET;
			case STATUS_CODE_OK_VALUE: return STATUS_CODE_OK;
			case STATUS_CODE_ERROR_VALUE: return STATUS_CODE_ERROR;
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
	private StatusCode(int value, String name, String literal) {
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
	
} //StatusCode
