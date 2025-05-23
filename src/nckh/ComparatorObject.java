package nckh;

/*
 * Copyright (c) 2023 Philippe Fournier-Viger
 *
 * This file is part of the SPMF DATA MINING SOFTWARE
 * (http://www.philippe-fournier-viger.com/spmf).
 *
 * SPMF is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * SPMF is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * SPMF. If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * This abstract class is a simple comparators for Object values.
 * 
 * @author Philippe Fournier-Viger
 * @see ListObject
 */
public abstract class ComparatorObject<T> {

	/**
	 * Compare two objects and return a value >0, =0 or <0 if the first object is
	 * bigger, equal or smaller than the second object
	 * 
	 * @param num1 the first object
	 * @param num2 the second object
	 * @return the comparison value
	 */
	public abstract int compare(T obj1, T ojb2);
}