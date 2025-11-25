import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'timeString',
  standalone: false
})
export class DateImpurePipe implements PipeTransform {

  transform(value: Date, ...args: unknown[]): unknown {
    console.log('transform(): ', value)
    return value.toLocaleTimeString();
  }


}
