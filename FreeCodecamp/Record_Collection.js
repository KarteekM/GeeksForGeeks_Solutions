function updateRecords(id, prop, value) {
  
if(prop !== 'tracks' && value !== "") {
    collection[id][prop] = value;
  }
  
  if(prop === 'tracks') {
    
    if(!collection[id][prop]){
    
        collection[id][prop] = [];
    }    
    
    
  }
  
  if(prop === 'tracks') {
   
    collection[id][prop].push(value);
  }
  
  if(value === "") {
    delete collection[id][prop];
  }
  
  return collection;
}
