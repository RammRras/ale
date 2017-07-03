/*
 * TipiOpachiOrario.h
 *
 *  Created on: 02 feb 2017
 *      Author: majid
 */

#ifndef TIPIOPACHIORARIO_H_
#define TIPIOPACHIORARIO_H_


typedef struct orario *orarioRef;
orarioRef createOrario(int, int, int);
char* ToString(orarioRef);
orarioRef orarioInFuso(int, orarioRef);


#endif /* TIPIOPACHIORARIO_H_ */
