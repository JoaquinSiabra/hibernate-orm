/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.boot.archive.scan.internal;

import org.hibernate.boot.archive.scan.spi.ScanParameters;

/**
 * @author Steve Ebersole
 */
public class StandardScanParameters implements ScanParameters {
	/**
	 * Singleton access
	 */
	public static final StandardScanParameters INSTANCE = new StandardScanParameters();

	private StandardScanParameters() {
	}
}
