import React, {createContext, useContext, useReducer} from 'react'

export const DataLayerContext = createContext();

export const DataLayer = ({initialState, reducer, children}) => (
    <DataLayerContext.Provider value={useReducer(reducer, initialState)}>
        {/* Anything that is between teh data layer, wrapping  */}
        {children}
    </DataLayerContext.Provider>
)

//passing data layer context
export const useDataLayerValue = () => useContext(DataLayerContext);